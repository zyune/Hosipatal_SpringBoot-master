package com.hospital.controller.od;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSONObject;
import com.hospital.model.*;
import com.hospital.model.od.AcceptMRPandList;
import com.hospital.service.od.Od_MedicalRecordServer;
import com.hospital.utils.Result;
import com.hospital.utils.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName Od_MedicalRecordController
 * @Description 这个是用来管理门诊医生的Controller的类,主要的功能具有
 *  <P>
 *      <li>门诊首页功能</li>
 *      <li>门诊病历（以身份证号码/名字查询以往的病历首页）</li>
 *      <li>成药草药处方（申请处方）</li>
 *      <li>西药处方（申请处方）</li>
 *      <Li>检查申请</Li>
 *      <Li>检验申请</Li>
 *      <li>处置申请</li>
 *      <Li>患者账单</Li>
 *  </P>
 *  所有的申请都可以进行查询结果
 *
 * @Author 方聪
 * @Date 2019/6/5 18:18
 * @Version 1.0
 **/

@Api(value = "用户的接口",tags={"方聪负责的门诊医生所需的api文档"})
@RestController //全部以JSON数据格式进行回复
@RequestMapping("/od")
@CrossOrigin
public class Od_MedicalRecordController {
    private Logger logger = LoggerFactory.getLogger(Od_MedicalRecordController.class);

    @Autowired
    Od_MedicalRecordServer od_medicalRecordServer;

    /**
     * @Description  得到当天登陆用户医生的id
     * @Date 14:25 2019/6/13
     * @Param []
     * @return int
     **/
    public int getDoctorID(){
        //通过shiro进行配置
        User user = (User)SecurityUtils.getSubject().getPrincipal();
        return user.getId();
    }
    /**
     * @Description  得到当天登陆用户医生所在的部门的id
     * @Date 14:25 2019/6/13
     * @Param []
     * @return int
     **/
    private int getDoctorDePartMentID() {

        User user = (User)SecurityUtils.getSubject().getPrincipal();
        return user.getDepartmentNo();
    }

    private String getDePartMentName() {

        User user = (User)SecurityUtils.getSubject().getPrincipal();
        return user.getDepartmentName();

    }

    @ApiOperation(value = "getWaitPatient",notes = "得到当天本门诊医生已经挂号，但是未看诊的病人，is_seen_docator == 1")
    @GetMapping(value = "/getWaitPatient")
    public Result getWaitPatient(){
//        Subject subject = SecurityUtils.getSubject();
////        Session session = subject.getSession();
////        PrincipalCollection previousPrincipals = subject.getPreviousPrincipals();
////        System.out.println("这个是当前用户的session");
////        System.out.println(session);
////        String id = (String)session.getAttribute("id");
////        System.out.println(id);
        User user = (User)SecurityUtils.getSubject().getPrincipal();
        System.out.println(user);
        //1.首先检查od_id是否已经登陆到系统中
        int od_id =  getDoctorID();//用户的id,我们这先模拟下
        //2.其次再查询今天等待的病人 系统会有一个定时任务的（就是会把当天为进行看诊的病人的状态给改为失效）
        String today= DateUtil.today();
        List<RegistrationInfo> list = od_medicalRecordServer.getWaitPatient(od_id,today);
        //3.返回结果
        return new Result(ResultCode.SUCCESS,list);
    }


    @ApiOperation(value = "getSeeEdPatient",notes = "得到当天本门诊医生已经挂号，但是看诊中和看诊完的病人，is_seen_docator == 2 | 3")
    @GetMapping(value = "/getSeeEdPatient")
    public Result getSeeEdPatient(){
        //1.首先检查od_id是否已经登陆到系统中
        int od_id =  getDoctorID();//用户的id,我们这先模拟下
        //2.其次再查询今天等待的病人 系统会有一个定时任务的（就是会把当天为进行看诊的病人的状态给改为失效）
        String today= DateUtil.today();
        List<RegistrationInfo> list = od_medicalRecordServer.getSeeEdPatient(od_id,today);
        //3.返回结果
        return new Result(ResultCode.SUCCESS,list);
    }

    @ApiOperation(value = "getSearchPatientByName",notes = "通过患者姓名查询患者挂号信息，state=1 and is_seen_docator == 1 | 2 | 3")
    @GetMapping(value = "/getSearchPatientByName")
    public Result getSearchPatientByName(String searchName){
        List<RegistrationInfo> list = od_medicalRecordServer.getSearchPatientByName(searchName);
        //3.返回结果
        return new Result(ResultCode.SUCCESS,list);
    }

    @ApiOperation(value = "getDePartMentPatient",notes = "得到所有该医生所属的科院当天看诊的病人，is_seen_docator == 1 | 2 | 3")
    @GetMapping(value = "/getDePartMentPatient")
    public Result getDePartMentPatient(){
        //1.首先检查od_id是否已经登陆到系统中
        int dePartMent_id =  getDoctorDePartMentID();//用户的id,我们这先模拟下
        //2.其次再查询今天等待的病人 系统会有一个定时任务的（就是会把当天为进行看诊的病人的状态给改为失效）
        String today= DateUtil.today();
        System.out.println("查询："+dePartMent_id+"部门，日期为："+today);
        List<RegistrationInfo> list = od_medicalRecordServer.getDePartMentPatient(dePartMent_id, today);
        //3.返回结果
        return new Result(ResultCode.SUCCESS,list);
    }


    @ApiOperation(value = "getMedicalRecordPageByPatientBLH",notes = "得到{is_seen_docator ==  2 | 3}传入的病人的病历号获得该病人的病历首页<br>因为未看诊的病人是没用病历首页的，在门诊病历首页表进行查询")
    @GetMapping(value = "/getMedicalRecordPageByPatientBLH")
    public Result getMedicalRecordPageByPatientBLH( String blh){
        MedicalRecordPage od = od_medicalRecordServer.getMedicalRecordPageByPatientBLH(blh);
        //3.返回结果
        return new Result(ResultCode.SUCCESS,od);
    }

    @ApiOperation(value = "",notes = "得到{is_seen_docator ==  2 | 3}传入的病人的病历号和mrp数据对象 暂存|和保存都执行这个方法,该病人的病历首页" +
            "<br>如果该病人无病历首页,也就是刚刚进行看诊的病人,那么insert插入一条,如果有就update更新," +
            "同时病人的is_seen_docator要从1改变为2")
    @PutMapping(value = "/PutMedicalRecordPage")
    public Result PutMedicalRecordPage(@RequestBody AcceptMRPandList acceptMRPandList ){
        System.out.println(acceptMRPandList.getMrp().toString());
        System.out.println("传入的诊断的结果的值");
        System.out.println(Arrays.toString(acceptMRPandList.getDiagnosis()));
        System.out.println("暂存");
        Diagnosi[] diagnosiList = acceptMRPandList.getDiagnosis();
        List<Diagnosi> ArraydiagnosiList = null;

        if(diagnosiList == null ||diagnosiList.length == 0 ){
            diagnosiList = null;
        }else {
            //说明后端不为null,是有诊断的结果传入过来的
            for(Diagnosi d:diagnosiList){
                d.setCreateTime(new DateTime());
                ArraydiagnosiList.add(d);
            }
        }
        acceptMRPandList.getMrp().setCreateTime(new DateTime());
        od_medicalRecordServer.PutMedicalRecordPage(acceptMRPandList.getMrp(),ArraydiagnosiList);
        return new Result(ResultCode.SUCCESS);

    }


    @ApiOperation(value = "",notes = "提交，调用暂存的方法，然后再改下状态")
    @GetMapping(value = "/surePatientOkPut")
    public Result surePatientOkPut(String infoId) {
        od_medicalRecordServer.surePatientOkPut(infoId);
        return new Result(ResultCode.SUCCESS);
    }
    @ApiOperation(value = "",notes = "提交，调用暂存的方法，然后再改下状态")
    @PutMapping(value = "/PutMedicalRecordPageEnd")
    public Result PutMedicalRecordPageEnd(@RequestBody  AcceptMRPandList acceptMRPandList ){
        System.out.println(acceptMRPandList.getMrp().toString());
        System.out.println("传入的诊断的结果的值");
        System.out.println(Arrays.toString(acceptMRPandList.getDiagnosis()));
        System.out.println("fdjkjadfjaksdjfkadjsf");
        Diagnosi[] diagnosiList = acceptMRPandList.getDiagnosis();
        List<Diagnosi> ArraydiagnosiList = null;
        if(diagnosiList.length == 0){
            diagnosiList = null;
        }else {
            //说明后端不为null,是有诊断的结果传入过来的
            ArraydiagnosiList = new ArrayList<>();
            for(Diagnosi d:diagnosiList){
                d.setCreateTime(new DateTime());
                ArraydiagnosiList.add(d);
            }

        }
        acceptMRPandList.getMrp().setCreateTime(new DateTime());
        od_medicalRecordServer.PutMedicalRecordPageEnd(acceptMRPandList.getMrp(),ArraydiagnosiList);
        return new Result(ResultCode.SUCCESS);
    }

    @ApiOperation(value = "",notes = "获得dica_name 或者dica_code进行查询数据，并且显示在列表中")
    @GetMapping(value = "/getDisease")
    public Result getDisease( String code,  String name){
        System.out.println(code+name);
        List<Disease> list = od_medicalRecordServer.getDisease(code,name);
        //3.返回结果
        return new Result(ResultCode.SUCCESS,list);
    }

    @ApiOperation(value = "",notes = "医生添加到自己的诊断到常用代码")
    @PostMapping(value = "/postUsedDiagnosi")
    public Result postUsedDiagnosi(@RequestBody UsedDiagnosi dia){
        dia.setDoctorNo(getDoctorID());
        od_medicalRecordServer.postUsedDiagnosi(dia);
        //3.返回结果
        return new Result(ResultCode.SUCCESS);
    }


    @ApiOperation(value = "",notes = "获得医生常用代码")
    @GetMapping(value = "/getUsedDiagnosi")
    public Result getUsedDiagnosi(){

        List<UsedDiagnosi> list = od_medicalRecordServer.getUsedDiagnosi(getDoctorID());
        //3.返回结果
        return new Result(ResultCode.SUCCESS,list);
    }



//    模板

    @ApiOperation(value = "",notes = "传入模板对象，模板对象可以没创建时间，可不传入部门id,医生id," +
            "需要在创建模板的时候填写模板的名称,然后传入诊断的list对象")
    @PostMapping(value = "/postMRPTemplate")
    public Result postMRPTemplate(@RequestBody  String params ){

        JSONObject j1 = JSONObject.parseObject(params);

        MedicalRecordPageTemplate mrpTemplate = JSONObject.parseObject(j1.getJSONObject("mrp").toJSONString(), MedicalRecordPageTemplate.class);
        List<Diagnosi> diagnosiList = JSONObject.parseArray(j1.getJSONArray("list").toJSONString(), Diagnosi.class);

        mrpTemplate.setId(null);

        diagnosiList.forEach(value -> {
            value.setCreateTime(new DateTime());
            value.setId(null);
            System.out.println(value.toString());
        });

        mrpTemplate.setDepartmentNo(getDoctorDePartMentID());
        mrpTemplate.setOutpatientDoctorNo(getDoctorID());
        mrpTemplate.setCreateTime(new DateTime());

        od_medicalRecordServer.postMRPTemplate(mrpTemplate,diagnosiList);

        return new Result(ResultCode.SUCCESS);
    }

//    @ApiOperation(value = "",notes = "传入模板对象，模板对象可以没创建时间，可不传入部门id,医生id," +
//            "需要在创建模板的时候填写模板的名称,然后传入诊断的list对象")
//    @PostMapping(value = "/postMRPTemplate")
//    public Result postMRPTemplate(@RequestBody MedicalRecordPageTemplate mrp,
//                                  @RequestBody ArrayList<Diagnosi> list){
//        mrp.setDepartmentNo(getDoctorDePartMentID());
//        mrp.setOutpatientDoctorNo(getDoctorID());
//        mrp.setCreateTime(new DateTime());
//
//        od_medicalRecordServer.postMRPTemplate(mrp,list);
//
//        return new Result(ResultCode.SUCCESS);
//    }

    @ApiOperation(value = "",notes = "获得科院的门诊首页病历创建全部模板list数据")
    @GetMapping(value = "/getMRPDePartMentTmplate")
    public Result getMRPDePartMentTmplate(){

        List<MedicalRecordPageTemplate> list = od_medicalRecordServer.getMRPDePartMentTmplate(getDoctorDePartMentID());
        //3.返回结果
        return new Result(ResultCode.SUCCESS,list);
    }

    @ApiOperation(value = "",notes = "通过一个模板id获得模板的对象")
    @GetMapping(value = "/getMRPTmplateByID/{id}")
    public Result getMRPTmplateByID(@PathVariable int id){

        MedicalRecordPageTemplate list = od_medicalRecordServer.getMRPTmplateByID(id);
        //3.返回结果
        return new Result(ResultCode.SUCCESS,list);
    }

    @ApiOperation(value = "",notes = "获得医生创建的所有的门诊首页的模板")
    @GetMapping(value = "/getMRPTmplateByDoctorID")
    public Result getMRPTmplateByDoctorID(){

        List<MedicalRecordPageTemplate>  list = od_medicalRecordServer.getMRPTmplateByDoctorID(getDoctorID());
        //3.返回结果
        return new Result(ResultCode.SUCCESS,list);
    }


    @ApiOperation(value = "",notes = "获得医生本院创建的所有的门诊首页的模板")
    @GetMapping(value = "/getMRPTmplateDeID")
    public Result getMRPTmplateDePartMentID(){

        List<MedicalRecordPageTemplate>  list = od_medicalRecordServer.getMRPTmplateDePartMentID(getDoctorDePartMentID());
        //3.返回结果
        return new Result(ResultCode.SUCCESS,list);
    }



    @ApiOperation(value = "",notes = "获得医生创建的所有的门诊首页的模板")
    @GetMapping(value = "/getMRPTmplateAll")
    public Result getMRPTmplateAll(){

        List<MedicalRecordPageTemplate>  list = od_medicalRecordServer.getMRPTmplateAll();
        //3.返回结果
        return new Result(ResultCode.SUCCESS,list);
    }

















}
