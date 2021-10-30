package com.hospital.service.od.odlmp;

import cn.hutool.core.date.DateTime;
import com.hospital.mapper.*;
import com.hospital.model.*;
import com.hospital.model.od.AcceptCheckTemplate;
import com.hospital.model.od.CheckAppliacationSUm;
import com.hospital.model.od.MRPListSum;
import com.hospital.service.od.Od_CheckServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName Od_CheckServerLmp
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/25 22:08
 * @Version 1.0
 **/
@Service
public class Od_CheckServerLmp implements Od_CheckServer {

    @Resource
    MedicalRecordPageMapper medicalRecordPageMapper;
    @Resource
    DiagnosiMapper diagnosiMapper; // 诊断
    @Resource
    CheckItemMapper checkItemMapper; // 检查项目
    @Resource
    FmedItemMapper fmedItemMapper;//非药品项目
    @Resource
    CheckApplicationMapper checkApplicationMapper;//检查申请
    @Resource
    CheckStackMapper checkStackMapper;
    @Resource
    CheckResultMapper checkResultMapper;
    @Resource
    CheckImgMapper checkImgMapper;

    @Override
    public List<FmedItem> getCheckFemdItemByName(String name, String type) {
        FmedItemExample ex = new FmedItemExample();
        FmedItemExample.Criteria c = ex.createCriteria();
        c.andRecordtypeEqualTo(Integer.parseInt(type));
        c.andItemnameLike("%" + name + "%");
        List<FmedItem> fmedItems = fmedItemMapper.selectByExample(ex);
        return fmedItems;
    }

    @Override
    public List<FmedItem> getFemdItemDataByFemdCodes(String codes) {
        List<FmedItem> list = new ArrayList<FmedItem>();
        String[] split = codes.split("\\|");
        for (int i = 0; i < split.length; i++) {
            FmedItemExample ex = new FmedItemExample();
            FmedItemExample.Criteria c = ex.createCriteria();
            c.andItemcodeEqualTo(split[i]);
            List<FmedItem> fmedItems = fmedItemMapper.selectByExample(ex);
            list.add(fmedItems.get(0));
        }
        return list;
    }

    @Override
    public void deleteCheckItemByCheckApplicationID(String checkID, String itemID) {
        CheckApplication checkApplication = checkApplicationMapper.selectByPrimaryKey(Integer.parseInt(checkID));
        String checkItemNos = checkApplication.getCheckItemNos();
        //减去的price
        Double subitemPrice = checkItemMapper.selectByPrimaryKey(Integer.parseInt(itemID)).getItemPrice();
        if (!checkItemNos.trim().equals("")) {
            checkItemMapper.deleteByPrimaryKey(Integer.parseInt(itemID));
            //在nos中去除
            String[] split = checkItemNos.split("\\|"); //[1,1]
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
                checkApplication.setPrice(checkApplication.getPrice()-subitemPrice);
                checkApplication.setCheckItemNos(substring);
            } else {
                checkApplication.setCheckItemNos("");
            }
            checkApplicationMapper.updateByPrimaryKey(checkApplication);
        }
    }


    @Override
    public void putCheckApplicationUseStateToOk(String id) {
        CheckApplication checkApplication = checkApplicationMapper.selectByPrimaryKey(Integer.parseInt(id));
        checkApplication.setUseState("2");
        checkApplicationMapper.updateByPrimaryKey(checkApplication);
    }

    @Override
    public List<CheckAppliacationSUm> getCheckApplicationByblh(String blh,String type) {
        CheckApplicationExample ex = new CheckApplicationExample();
        CheckApplicationExample.Criteria c = ex.createCriteria();
        c.andMedicalRecordEqualTo(blh);
        c.andStateEqualTo("1");
        c.andCheckTypeEqualTo(type);
        List<CheckApplication> fmedItems = checkApplicationMapper.selectByExample(ex);
        //定义一个的List
        ArrayList<CheckAppliacationSUm> list = new ArrayList<>();

        CheckAppliacationSUm checkAppliacationSUm = new CheckAppliacationSUm();
        for (int j = 0; j < fmedItems.size(); j++) {
            checkAppliacationSUm = new CheckAppliacationSUm();
            CheckApplication value = fmedItems.get(j);
            System.out.println("第" + (j + 1) + "查询出来的数据为：" + value.toString());
            checkAppliacationSUm.setCheckApplication(value);
            if (value.getCheckItemNos().equals("")) {
                //也就是说这个申请是没有数据的
                checkAppliacationSUm.setCheckItemList(null);
            } else {
                String[] checkItemNos = value.getCheckItemNos().split("\\|");
                System.out.println(Arrays.toString(checkItemNos));
                List<CheckItem> clist = new ArrayList<>();
                for (int i = 0; i < checkItemNos.length; i++) {
                    //从数据库中通过id获得item
                    int i1 = Integer.parseInt(checkItemNos[i]);
                    CheckItem checkItem = checkItemMapper.selectByPrimaryKey(i1);
                    clist.add(checkItem);
                }
                checkAppliacationSUm.setCheckItemList(clist);
            }
            list.add(checkAppliacationSUm);
        }
        return list;
    }



    @Override
    public void postCheckApplication(CheckApplication check, List<CheckItem> checkItems) {

        if (checkItems.size() == 0) {
            check.setCheckItemNos("");
            checkApplicationMapper.insert(check);
        } else {
            //把dianosiList插入到数据库中并且返回id
            StringBuilder sb = new StringBuilder();
            for (CheckItem d : checkItems) {
                int id = checkItemMapper.insert(d);
                sb.append(d.getId() + "|");
            }
            System.out.println(sb.toString().substring(0, sb.toString().length() - 1));
            check.setCheckItemNos(sb.toString().substring(0, sb.toString().length() - 1));
            checkApplicationMapper.insert(check);
        }
    }

    @Override
    public List<FmedItem> getCheckFemdItem() {
        FmedItemExample ex = new FmedItemExample();
        FmedItemExample.Criteria c = ex.createCriteria();
        c.andRecordtypeEqualTo(2);
        List<FmedItem> fmedItems = fmedItemMapper.selectByExample(ex);
        return fmedItems;
    }

    @Override
    public MRPListSum getMRPandListbyMedicalRecord(String blh) {
        MRPListSum mr = new MRPListSum();
        MedicalRecordPageExample ex = new MedicalRecordPageExample();
        MedicalRecordPageExample.Criteria c = ex.createCriteria();
        c.andMedicalRecordEqualTo(blh);
        List<MedicalRecordPage> medicalRecordPages = medicalRecordPageMapper.selectByExample(ex);
        MedicalRecordPage m = medicalRecordPages.get(0);
        mr.setMrp(m);
        if (m.getDiagnosiNos().trim().equals("")) {
            mr.setDiagnosiList(null);
        } else {
            List<Diagnosi> lsit = new ArrayList<>();
            String[] split = m.getDiagnosiNos().trim().split("\\|");
            for (String s : split) {
                //查询对象
                lsit.add(diagnosiMapper.selectByPrimaryKey(Integer.parseInt(s)));
            }
            mr.setDiagnosiList(lsit);
        }
        return mr;
    }

    @Override
    public void putCheckApplicationUseStateToDelete(String id) {
        CheckApplication checkApplication = checkApplicationMapper.selectByPrimaryKey(Integer.parseInt(id));
        checkApplication.setUseState("3");
        checkApplicationMapper.updateByPrimaryKey(checkApplication);
    }

    @Override
    public void sureAlertAppliction(String[] info) {

        CheckApplication checkApplication = checkApplicationMapper.selectByPrimaryKey(Integer.parseInt(info[2]));

       checkApplication.setCheckApplicationName(info[0]);
        checkApplication.setCheckApplicationName(info[1]);

        checkApplicationMapper.updateByPrimaryKey(checkApplication);

    }

    @Override
    public void postNewCheckApplication(CheckApplication checkApplication) {
        String checkItemNos = "";
        double sumPrice = 0.0;
        if(checkApplication.getCheckItemNos()!=null && !checkApplication.getCheckItemNos().equals("") ){
            System.out.println(checkApplication.getCheckItemNos());
            //然后需要更
            String[] code = checkApplication.getCheckItemNos().split("\\|");
            for(int i=0;i<code.length;i++){
                //生成一个checkItem
                FmedItemExample ex = new FmedItemExample();
                FmedItemExample.Criteria c = ex.createCriteria();
                c.andItemcodeEqualTo(code[i]);
                List<FmedItem> fmedItems = fmedItemMapper.selectByExample(ex);


                CheckItem checkItem = new CheckItem();
                checkItem.setItemHandleState("1");
                checkItem.setCreateTime(new DateTime());
                checkItem.setId(null);
                checkItem.setItemCode(code[i]);
                checkItem.setItemName(fmedItems.get(0).getItemname());
                checkItem.setItemPrice(fmedItems.get(0).getPrice());
                sumPrice +=fmedItems.get(0).getPrice();
                int checkItemID = checkItemMapper.insert(checkItem);
                checkItemID = checkItem.getId();
                checkItemNos += checkItemID+"|";
            }
            checkItemNos = checkItemNos.substring(0, checkItemNos.length() - 1);
        }
        checkApplication.setCheckItemNos(checkItemNos);
        checkApplication.setPrice(sumPrice);
        checkApplicationMapper.insert(checkApplication);
    }


    @Override
    public int postNewCheckItem(CheckItem checkItem, Integer checkApplicationID) {

        //首先通过id获得
        CheckApplication checkApplication = checkApplicationMapper.selectByPrimaryKey(checkApplicationID);

        String checkItemNos = checkApplication.getCheckItemNos();
        //insert,返回的insert为主键,那么这个表xml需要进行额外的操作
        int checkItemID = checkItemMapper.insert(checkItem);
        checkItemID = checkItem.getId();//返回主键
        if (!checkItemNos.trim().equals("")) {
            //说明这个有值的数据
            checkItemNos += "|" + checkItemID;
        } else {
            checkItemNos += "" + checkItemID;
        }

        //然后再更新
        checkApplication.setCheckItemNos(checkItemNos);
        checkApplication.setPrice(checkApplication.getPrice()+checkItem.getItemPrice());
        checkApplicationMapper.updateByPrimaryKey(checkApplication);
        return checkItemID;
    }



    @Override
    public void postNewCheckTemplate(AcceptCheckTemplate acceptCheckTemplate) {
        //这个方法把数据保存在数据库中

        List<String[]> itemCodeList = acceptCheckTemplate.getItemCodeList();
        if (itemCodeList == null) {
            acceptCheckTemplate.getCheckStack().setFmedItemNos("");
            acceptCheckTemplate.getCheckStack().setFmedItemNames("");
        } else {
            String nos = "";
            String names = "";
            for (int i = 0; i < itemCodeList.size(); i++) {
                String code = itemCodeList.get(i)[0];
                nos += code + "|";
                String name = itemCodeList.get(i)[1];
                names += name + "|";
            }
            nos = nos.substring(0, nos.length() - 1);
            acceptCheckTemplate.getCheckStack().setFmedItemNos(nos);

            names = names.substring(0, names.length() - 1);
            acceptCheckTemplate.getCheckStack().setFmedItemNames(names);
        }
        acceptCheckTemplate.getCheckStack().setId(null);
        checkStackMapper.insert(acceptCheckTemplate.getCheckStack());


    }


    @Override
    public List<Object> getItemResult(String id) {
//        getItemResult()
        List<Object> list = new ArrayList<>();
        CheckResultExample ex = new CheckResultExample();
        CheckResultExample.Criteria c = ex.createCriteria();
        c.andCheckApplicationNoEqualTo(Integer.parseInt(id));
        List<CheckResult> checkResults = checkResultMapper.selectByExample(ex);
        CheckResult result = checkResults.get(0);
        //得到了result的属性了
        list.add(result);
        if(result.getCheckResultImgs() == null || result.getCheckResultImgs().equals("")){
            List<CheckImg> resultImgs = new ArrayList<>();
            list.add(resultImgs);
        }else{
            String[] imgs = result.getCheckResultImgs().split("\\|");
            List<CheckImg> resultImgs = new ArrayList<>();
            for(String imgId:imgs){
                CheckImg checkImg = checkImgMapper.selectByPrimaryKey(Integer.parseInt(imgId));
                resultImgs.add(checkImg);
            }
            list.add(resultImgs);
        }
        return list;
    }




    @Override
    public List<CheckStack> getCheckTemplateByDoctorID(int doctorID, String type) {
        CheckStackExample ex = new CheckStackExample();
        CheckStackExample.Criteria c = ex.createCriteria();
        c.andStateEqualTo("1");
        c.andCheckTypeEqualTo(type);
        c.andOutpatientDoctorNoEqualTo(doctorID);
        return checkStackMapper.selectByExample(ex);
    }

    @Override
    public List<CheckStack> getCheckTemplateAllDeID(int doctorDePartMentID, String type) {

        CheckStackExample ex = new CheckStackExample();
        CheckStackExample.Criteria c = ex.createCriteria();
        c.andStateEqualTo("1");
        c.andCheckTypeEqualTo(type);
        c.andDepartmentNoEqualTo(doctorDePartMentID + "");
        return checkStackMapper.selectByExample(ex);
    }

    @Override
    public List<CheckStack> getCheckTemplateAll(String type) {
        CheckStackExample ex = new CheckStackExample();
        CheckStackExample.Criteria c = ex.createCriteria();
        c.andCheckTypeEqualTo(type);
        c.andStateEqualTo("1");
        return checkStackMapper.selectByExample(ex);
    }





}
