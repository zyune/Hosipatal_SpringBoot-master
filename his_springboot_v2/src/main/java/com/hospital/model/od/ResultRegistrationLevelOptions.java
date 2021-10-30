package com.hospital.model.od;

import java.util.ArrayList;
import java.util.logging.Level;

public class ResultRegistrationLevelOptions {

  public   ArrayList<RegistrationOptionLevel> list ;

}
class RegistrationOptionLevel {

    public String value;
    public String lable;
    public String fee;//挂号费
    public ArrayList<RegistrationDepartment> departmentList;




    /**
     *    {
     *           value: 'A1',
     *           label: '普通号',
     *           children: [{
     *             value: 'shejiyuanze',
     *             label: '设计原则',
     *             children: [{
     *               value: 'yizhi',
     *               label: '一致'
     *             }, {
     *               value: 'fankui',
     *               label: '反馈'
     *             }, {
     *               value: 'xiaolv',
     *               label: '效率'
     *             }, {
     *               value: 'kekong',
     *               label: '可控'
     *             }]
     *           }, {
     *             value: 'B1',
     *             label: '拳部门',
     *             children: [{
     *               value: 'C1',
     *               label: '方聪'
     *             }, {
     *               value: 'dingbudaohang',
     *               label: '顶部导航'
     *             }]
     *           }]
     *         },
      */


}

class RegistrationDepartment {

    public String value;
    public String label;
    public  ArrayList<RegistrationDoctor> list;


    //{
    //            value: 'shejiyuanze',
    //            label: '设计原则',
    //            children: [{
    //              value: 'yizhi',
    //              label: '一致'
    //            }, {
    //              value: 'fankui',
    //              label: '反馈'
    //            }, {
    //              value: 'xiaolv',
    //              label: '效率'
    //            }, {
    //              value: 'kekong',
    //              label: '可控'
    //            }]
    //          }


}

class RegistrationDoctor{
    public String value;
    public String lable;
    public String leftQuota;
}