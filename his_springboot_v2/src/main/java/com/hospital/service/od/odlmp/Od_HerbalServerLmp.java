package com.hospital.service.od.odlmp;

import com.hospital.mapper.*;
import com.hospital.model.*;
import com.hospital.model.od.*;
import com.hospital.service.od.Od_HerbalServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName Od_HerbalServerLmp
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/25 22:08
 * @Version 1.0
 **/
@Service
public class Od_HerbalServerLmp implements Od_HerbalServer {

    @Resource
    MedicalRecordPageMapper medicalRecordPageMapper;
    @Resource
    DrugsMapper drugsMapper; // 诊断
    @Resource
    HerbalItemMapper herbalItemMapper; // 检查项目
    @Resource
    HerbalApplicationMapper herbalApplicationMapper;//检查申请

    //通过name搜索草药
    @Override
    public List<Drugs> getHerbalDrugsByName(String name, String type) {
        DrugsExample ex = new DrugsExample();
        DrugsExample.Criteria c = ex.createCriteria();
        c.andDrugsTypeEqualTo("101");
        c.andDrugsNameLike("%"+name+"%");
        List<Drugs> drugs = drugsMapper.selectByExample(ex);
        return drugs;
    }
    //通过name搜索西药
    @Override
    public List<Drugs> getMedicineDrugsByName(String name,String type) {
        DrugsExample ex = new DrugsExample();
        DrugsExample.Criteria c = ex.createCriteria();
        c.andDrugsTypeEqualTo("102");
        c.andDrugsNameLike("%"+name+"%");
        List<Drugs> drugs = drugsMapper.selectByExample(ex);
        return drugs;
    }
    //通过申请id删除药品的信息
    @Override
    public void deleteHerbalItemByHerbalApplicationID(String herbalID, String itemID) {
        HerbalApplication herbalApplication = herbalApplicationMapper.selectByPrimaryKey(Integer.parseInt(herbalID));
        String herbalItemNos = herbalApplication.getHerbalItemNos();
        //减去的price
        Double subitemPrice = herbalItemMapper.selectByPrimaryKey(Integer.parseInt(itemID)).getDrugsPrice();
        if (!herbalItemNos.trim().equals("")) {
            herbalItemMapper.deleteByPrimaryKey(Integer.parseInt(itemID));
            //在nos中去除
            String[] split = herbalItemNos.split("\\|"); //[1,1]
            if (split.length > 1) {
                //index为该相同的所在的位置，重新生成一个nos
                String newNos = "";
                for (String id : split) {
                    if (id.equals(itemID)) {
                    } else {
                        newNos += id + "|";
                    }
                }
                String substring = newNos.substring(0, newNos.length() - 1);
                herbalApplication.setPrice(herbalApplication.getPrice()-subitemPrice);
                herbalApplication.setHerbalItemNos(substring);
            } else {
                herbalApplication.setHerbalItemNos("");
            }
            herbalApplicationMapper.updateByPrimaryKey(herbalApplication);
        }
    }
    //由暂存设置为发送
    @Override
    public void putHerbalApplicationUseStateToOk(String id) {
        HerbalApplication herbalApplication = herbalApplicationMapper.selectByPrimaryKey(Integer.parseInt(id));
        herbalApplication.setUseState("2");
        herbalApplicationMapper.updateByPrimaryKey(herbalApplication);
    }
    //通过病历号查询对应的药品的申请信息
    @Override
    public List<HerbalAppliacationSUm> getHerbalApplicationByblh(String blh,String type) {
        HerbalApplicationExample ex = new HerbalApplicationExample();
        HerbalApplicationExample.Criteria c = ex.createCriteria();
        c.andMedicalRecordEqualTo(blh);
        c.andStateEqualTo("1");
        c.andHerbalTypeEqualTo(type);
        List<HerbalApplication> herbalItems = herbalApplicationMapper.selectByExample(ex);
        //定义一个的List
        ArrayList<HerbalAppliacationSUm> list = new ArrayList<>();

        HerbalAppliacationSUm herbalAppliacationSUm = new HerbalAppliacationSUm();
        for (int j = 0; j < herbalItems.size(); j++) {
            herbalAppliacationSUm = new HerbalAppliacationSUm();
            HerbalApplication value = herbalItems.get(j);
            System.out.println("第" + (j + 1) + "查询出来的数据为：" + value.toString());
            herbalAppliacationSUm.setHerbalApplication(value);
            if (value.getHerbalItemNos() == null) {
                //也就是说这个申请是没有数据的
                herbalAppliacationSUm.setHerbalItemList(null);
            } else {
                String[] herbalItemNos = value.getHerbalItemNos().split("\\|");
                System.out.println(Arrays.toString(herbalItemNos));
                List<HerbalItem> clist = new ArrayList<>();
                for (int i = 0; i < herbalItemNos.length; i++) {
                    //从数据库中通过id获得item
                    int i1 = Integer.parseInt(herbalItemNos[i]);
                    HerbalItem herbalItem = herbalItemMapper.selectByPrimaryKey(i1);
                    clist.add(herbalItem);
                }
                herbalAppliacationSUm.setHerbalItemList(clist);
            }
            list.add(herbalAppliacationSUm);
        }
        return list;
    }
    @Override
    public void postHerbalApplication(HerbalApplication herbal, List<HerbalItem> herbalItems) {
        if (herbalItems.size() == 0) {
            herbal.setHerbalItemNos("");
            herbalApplicationMapper.insert(herbal);
        } else {
            //把dianosiList插入到数据库中并且返回id
            StringBuilder sb = new StringBuilder();
            for (HerbalItem d : herbalItems) {
                int id = herbalItemMapper.insert(d);
                sb.append(d.getId() + "|");
            }
            System.out.println(sb.toString().substring(0, sb.toString().length() - 1));
            herbal.setHerbalItemNos(sb.toString().substring(0, sb.toString().length() - 1));
            herbalApplicationMapper.insert(herbal);
        }
    }

    @Override
    public List<HerbalItem> getHerbalFemdItem() {
        HerbalItemExample ex = new HerbalItemExample();
        HerbalItemExample.Criteria c = ex.createCriteria();

        List<HerbalItem> herbalItems = herbalItemMapper.selectByExample(ex);
        return herbalItems;
    }


    @Override
    public void putHerbalApplicationUseStateToDelete(String id) {
        HerbalApplication herbalApplication = herbalApplicationMapper.selectByPrimaryKey(Integer.parseInt(id));
        herbalApplication.setUseState("3");
        herbalApplicationMapper.updateByPrimaryKey(herbalApplication);
    }

    //修改申请
    @Override
    public void sureAlertAppliction(HerbalApplication herbalAppliacation) {
        herbalApplicationMapper.updateByPrimaryKey(herbalAppliacation);

    }

    @Override
    public List<Drugs> putHerbalApplicationUseStateToSave(HerbalAppliacationSUm h) {
        //首先先判断是否有值
       StringBuilder sb = new StringBuilder();
        List<HerbalItem> herbalItemList = h.getHerbalItemList();
       //中有值
       if(h.getHerbalApplication().getHerbalItemNos() != null && !h.getHerbalApplication().getHerbalItemNos().equals("")) {
            //先遍历是否存在删除,就是判断nos是否在里面
           String[] s = h.getHerbalApplication().getHerbalItemNos().split("\\|");
           for(String x:s){
               boolean f = false;//false 表示不在这个集合；
               for(HerbalItem her : herbalItemList) {
                   if (her.getId() != null) {
                        if((her.getId()+"").equals(x)){
                            f = true;
                            break;
                        }
                   }
               }
               if(!f){
                   //表示进行了删除,那就把原来的也进行删除把
                   herbalItemMapper.deleteByPrimaryKey(Integer.parseInt(x));
               } else {
                   sb.append(x+"|");
               }
           }
       }
       //判断是否有新增加的
        for(HerbalItem her : herbalItemList){
            if(her.getId() == null){
                herbalItemMapper.insert(her);
                Integer id = her.getId();
                sb.append(id+"|");

            }
        }
        h.getHerbalApplication().setHerbalItemNos(sb.toString().substring(0, sb.toString().length() - 1));
        herbalApplicationMapper.updateByPrimaryKey(h.getHerbalApplication());
        return null;
    }

    @Override
    public void postNewHerbalApplication(HerbalApplication herbalApplication) {
        double sumPrice = 0.0;
        herbalApplication.setPrice(sumPrice);

        herbalApplicationMapper.insert(herbalApplication);
    }


    @Override
    public int postNewHerbalItem(HerbalItem herbalItem, Integer herbalApplicationID) {

        //首先通过id获得
        HerbalApplication herbalApplication = herbalApplicationMapper.selectByPrimaryKey(herbalApplicationID);

        String herbalItemNos = herbalApplication.getHerbalItemNos();
        //insert,返回的insert为主键,那么这个表xml需要进行额外的操作
        int herbalItemID = herbalItemMapper.insert(herbalItem);
        herbalItemID = herbalItem.getId();//返回主键
        if (!herbalItemNos.trim().equals("")) {
            //说明这个有值的数据
            herbalItemNos += "|" + herbalItemID;
        } else {
            herbalItemNos += "" + herbalItemID;
        }

        //然后再更新
        herbalApplication.setHerbalItemNos(herbalItemNos);
        herbalApplication.setPrice(herbalApplication.getPrice()+herbalItem.getDrugsPrice());
        herbalApplicationMapper.updateByPrimaryKey(herbalApplication);
        return herbalItemID;
    }

    






}
