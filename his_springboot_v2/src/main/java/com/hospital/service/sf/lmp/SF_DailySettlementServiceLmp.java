package com.hospital.service.sf.lmp;

import com.hospital.mapper.*;
import com.hospital.model.*;
import com.hospital.service.sf.SF_DailySettlementService;
import com.hospital.utils.DateUtilsdemo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service

public class SF_DailySettlementServiceLmp implements SF_DailySettlementService {

    @Resource
    DailySettlementMapper dailySettlementMapper;

    @Resource
    DailyDetailMapper dailyDetailMapper;

    @Resource
    CheckFeeMapper checkFeeMapper;

    @Resource
    HerbalFeeMapper herbalFeeMapper;

    @Resource
    RegistrationFeeMapper registrationFeeMapper;

    @Override
    public List<DailySettlement> listDailySettlement() {
        DailySettlementExample dailySettlementExample = new DailySettlementExample ();
        List<DailySettlement> dailySettlements = dailySettlementMapper.selectByExample (dailySettlementExample);
        return dailySettlements;
    }


//    @Override
//    public List<DailySettlement> listDailySettlement() {
//        DailySettlementExample dailySettlementExample = new DailySettlementExample ();
//        List<DailySettlement> dailySettlements = dailySettlementMapper.selectByExample (dailySettlementExample);
//        return dailySettlements;
//    }

    @Override
    public List<DailyDetail> listDailyDetailByRegistrarNo(Integer dailySettlementNo) {
        DailyDetailExample dailyDetailExample = new DailyDetailExample ();
        DailyDetailExample.Criteria criteria = dailyDetailExample.createCriteria ();
        criteria.andDailySettlementNoEqualTo (dailySettlementNo);
        List<DailyDetail> list = dailyDetailMapper.selectByExample(dailyDetailExample);
        return list;

    }

    @Override
    public void listDailyDetailByRegistrar(Date startDate, Date endDate, String id) {
     //   生成日结表
        //日结表插入数据
        DailySettlement dailySettlement = new DailySettlement ();
        dailySettlement.setEndTime (endDate);
        dailySettlement.setRegistrarNo (Integer.parseInt (id));
        dailySettlement.setRegistrarName ("xx");
        dailySettlement.setStartTime (startDate);
        dailySettlement.setFee (0.0);

        dailySettlementMapper.insert (dailySettlement);
        //获取日结表的id
        int dailyID = dailySettlement.getId ();
         double sumprice = 0.0;
        //转化一下时间格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("yyyy-MM-dd");//createTime xxxx-xx-xx 2018-05-26
        String s = simpleDateFormat.format (startDate);
        String n = simpleDateFormat.format (endDate);
        System.out.println ("s:"+s);
        System.out.println ("n"+n);
//        日结明细表
        DailyDetailExample dailyDetailExample = new DailyDetailExample ();
        //检查费 查询所有
        CheckFeeExample checkFeeExample = new CheckFeeExample();
        CheckFeeExample.Criteria c = checkFeeExample.createCriteria ();

        List<CheckFee> checkFees = checkFeeMapper.selectByExample (checkFeeExample);
        //查询所在时间内的
        for(CheckFee checkFee:checkFees) {
            //对时间的操作
            Date d = checkFee.getCreateTime ();
            String m = simpleDateFormat.format (d);
            System.out.println ("m:" + m);

            boolean yes = DateUtilsdemo.inTheTwoDate (m, s, n);
            System.out.println ("是否在区间：" + yes);
            System.out.println (checkFee.getRegistrarNo ());
            if (yes == true && checkFee.getRegistrarNo () == Integer.parseInt (id)) {
                System.out.println ("执行了");
                DailyDetail dailyDetail = new DailyDetail ();
                dailyDetail.setAccountToPay ("0");
                dailyDetail.setSettlementCategory ("自费");
                dailyDetail.setDiscountAmount (0.0);
                // 最关键的一步
                dailyDetail.setPrice (checkFee.getPrice ());
                sumprice += checkFee.getPrice ();
                dailyDetail.setDailySettlementNo (dailyID);

                dailyDetailMapper.insert (dailyDetail);
            }
        };
            HerbalFeeExample herbalFeeExample = new HerbalFeeExample ();

        List<HerbalFee> herbalFees = herbalFeeMapper.selectByExample (herbalFeeExample);
        HerbalFeeExample.Criteria criteria1 = herbalFeeExample.createCriteria ();
        for(HerbalFee herbalFee:herbalFees){
            Date d = herbalFee.getCreateTime();
            String m = simpleDateFormat.format (d);
            boolean yes = DateUtilsdemo.inTheTwoDate (m,s,n);

            System.out.println ("是否在区间:"+yes);
            if(yes == true && herbalFee.getRegistrarNo ()== Integer.parseInt (id)){
                DailyDetail dailyDetail = new DailyDetail ();
                dailyDetail.setAccountToPay ("0");
                dailyDetail.setSettlementCategory ("自费");
                dailyDetail.setDiscountAmount (0.0);
                // 最关键的一步== Integer.parseInt (id)
                dailyDetail.setPrice (herbalFee.getPrice ());
                sumprice += herbalFee.getPrice ();
                dailyDetail.setDailySettlementNo (dailyID);
                dailyDetailMapper.insert (dailyDetail);
            }
        }
        RegistrationFeeExample registrationFeeExample = new RegistrationFeeExample ();
        RegistrationFeeExample.Criteria c1 = registrationFeeExample.createCriteria ();
        c1.andStateEqualTo ("1");//1是有效的 因为会退号

        List<RegistrationFee> registrationFees = registrationFeeMapper.selectByExample (registrationFeeExample);
        RegistrationFeeExample.Criteria criteria2 = registrationFeeExample.createCriteria ();
        for(RegistrationFee registrationFee:registrationFees){
            Date d = registrationFee.getCreateTime ();
            String m = simpleDateFormat.format (d);
            boolean yes = DateUtilsdemo.inTheTwoDate (m,s,n);
                    if(yes == true && registrationFee.getRegistrarNo () == Integer.parseInt (id)){
                        DailyDetail dailyDetail = new DailyDetail ();
                        dailyDetail.setAccountToPay ("0");
                        dailyDetail.setSettlementCategory ("自费");
                        dailyDetail.setDiscountAmount (0.0);
                        // 最关键的一步
                        dailyDetail.setPrice (registrationFee.getPrice ());
                        dailyDetail.setDailySettlementNo (dailyID);
                        sumprice += registrationFee.getPrice ();
                        dailyDetailMapper.insert (dailyDetail);
                    }

                }

        DailySettlement dailySettlement1 = dailySettlementMapper.selectByPrimaryKey (dailyID);
        dailySettlement1.setFee (sumprice);
        dailySettlementMapper.updateByPrimaryKey (dailySettlement1);

    }

        };
