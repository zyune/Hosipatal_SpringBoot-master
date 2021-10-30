package com.hospital.controller.od;

import cn.hutool.core.date.DateTime;
import com.alibaba.fastjson.JSONObject;
import com.hospital.model.*;
import com.hospital.model.od.AcceptCheckTemplate;
import com.hospital.model.od.CheckAppliacationSUm;
import com.hospital.model.od.MRPListSum;
import com.hospital.service.od.Od_CheckServer;
import com.hospital.service.od.odlmp.imgUpload;
import com.hospital.utils.Result;
import com.hospital.utils.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName Od_CheckController
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/24 18:20
 * @Version 1.0
 **/
@Api(value = "用户的接口",tags={"方聪负责的门诊医生检查申请所需的api文档"})
@RestController //全部以JSON数据格式进行回复
@RequestMapping("/od")
@CrossOrigin
public class Od_CheckController {

    private Logger logger = LoggerFactory.getLogger(Od_MedicalRecordController.class);
//    @Autowired
//    Od_MedicalRecordServer od_medicalRecordServer;
    @Autowired
    Od_CheckServer od_CheckServer;
    @Autowired
    imgUpload imgUploadServer;
    /**
     * @Description  得到当天登陆用户医生的id
     * @Date 14:25 2019/6/13
     * @Param []
     * @return int
     **/
    public int getDoctorID(){
        //通过shiro进行配置
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        return user.getId();
    }
    public String getDoctorName(){
        //通过shiro进行配置
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        return user.getName();
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


    @ApiOperation(value = "",notes = "获得全院检查申请项目,2是检查,通过name进行搜索")
    @PostMapping(value = "/postImg")
    public Result postImg(@RequestParam("h")String name, @RequestParam("file")MultipartFile  file ){
        System.out.println(name);
            String uploadFilePath = imgUploadServer.getUploadFilePath(file);
        System.out.println(uploadFilePath);
        return new Result(ResultCode.SUCCESS);
    }

    @ApiOperation(value = "",notes = "获得全院检查申请项目,2是检查,通过name进行搜索")
    @GetMapping(value = "/getCheckFemdItemByName")
    public Result getCheckFemdItemByName(String name){
        List<FmedItem> list = od_CheckServer.getCheckFemdItemByName(name,"2");
        return new Result(ResultCode.SUCCESS,list);
    }

    @ApiOperation(value = "",notes = "获得全院检验申请项目,1是检查,通过name进行搜索")
    @GetMapping(value = "/getInspectFemdItemByName")
    public Result getInspectFemdItemByName(String name){
        List<FmedItem> list = od_CheckServer.getCheckFemdItemByName(name,"1");
        return new Result(ResultCode.SUCCESS,list);
    }

    @ApiOperation(value = "",notes = "获得全院处置申请项目,3是处置,通过name进行搜索")
    @GetMapping(value = "/getDisposeFemdItemByName")
    public Result getDisposeFemdItemByName(String name){
        List<FmedItem> list = od_CheckServer.getCheckFemdItemByName(name,"3");
        return new Result(ResultCode.SUCCESS,list);
    }
    @ApiOperation(value = "",notes = "通过传入检查申请id,删除该id中检查项目")
    @DeleteMapping (value = "/deleteCheckItemByCheckApplicationID")
    public Result deleteCheckItemByCheckApplicationID( String checkID,String itemID){
        od_CheckServer.deleteCheckItemByCheckApplicationID(checkID,itemID);
        return new Result(ResultCode.SUCCESS,null);
    }

    @ApiOperation(value = "",notes = "通过传入的检查申请表的id,修改useState由1变成2")
    @PutMapping(value = "/putCheckApplicationUseStateToOk")
    public Result putCheckApplicationUseStateToOk(@RequestBody String id){
        od_CheckServer.putCheckApplicationUseStateToOk(id);
        return  new Result(ResultCode.SUCCESS);
    }

    @ApiOperation(value = "",notes = "通过病人的病历号，获得该病人对应的list申请，并且在list申请中具有该对应的申请项目的list数据" +
            "这样的数据[{[{},{}]},{[{},{}]}]")
    @GetMapping(value = "/getCheckApplicationByblh")
    public Result getCheckApplicationByblh(String blh){
        List<CheckAppliacationSUm> list = od_CheckServer.getCheckApplicationByblh(blh,"1");
        return new Result(ResultCode.SUCCESS,list);
    }


    @ApiOperation(value = "",notes = "通过病人的病历号，获得该病人对应的list申请，并且在list申请中具有该对应的申请项目的list数据" +
            "这样的数据[{[{},{}]},{[{},{}]}]")
    @GetMapping(value = "/getInspectApplicationByblh")
    public Result getInspectApplicationByblh(String blh){
        List<CheckAppliacationSUm> list = od_CheckServer.getCheckApplicationByblh(blh,"2");
        return new Result(ResultCode.SUCCESS,list);
    }

    @ApiOperation(value = "",notes = "通过病人的病历号，获得该病人对应的list申请，并且在list申请中具有该对应的申请项目的list数据" +
            "这样的数据[{[{},{}]},{[{},{}]}]")
    @GetMapping(value = "/getDisposeApplicationByblh")
    public Result getDisposeApplicationByblh(String blh){
        List<CheckAppliacationSUm> list = od_CheckServer.getCheckApplicationByblh(blh,"3");
        return new Result(ResultCode.SUCCESS,list);
    }


    @ApiOperation(value = "getMRPandListbyMedicalRecord",notes = "通过患者的病历号，获得患者的门诊病历信息以及对应的诊断信息（暂存和以及提交的），提交的信息不能进行更改" +
            "数据类型应该deleteCheckItemByCheckApplicationID为：{mrp+[]}MRPListSum对象")
    @GetMapping(value = "/getMRPandListbyMedicalRecord")
    public Result getMRPandListbyMedicalRecord(String blh){
        MRPListSum mrpListSum = od_CheckServer.getMRPandListbyMedicalRecord(blh);
        //3.返回结果
        return new Result(ResultCode.SUCCESS,mrpListSum);
    }

    @ApiOperation(value = "",notes = "通过传入的检查申请表的id,修改useState由2变成3")
    @PutMapping(value = "/putCheckApplicationUseStateToDelete")
    public Result putCheckApplicationUseStateToDelete(@RequestBody String id){
        od_CheckServer.putCheckApplicationUseStateToDelete(id);
        return  new Result(ResultCode.SUCCESS);
    }

    @ApiOperation(value = "",notes = "修改申请名称和申请的要求，传入String[] 0 1 2 2表示申请的id")
    @PutMapping(value = "/sureAlertAppliction")
    public Result sureAlertAppliction(@RequestBody String[] info){
        od_CheckServer.sureAlertAppliction(info);
        return  new Result(ResultCode.SUCCESS);
    }

    @ApiOperation(value = "",notes = "传入创建信息创建一个新的CheckApplication以及生成对应的项目")
    @PostMapping(value = "/postNewCheckApplication")
    public Result postNewCheckApplication(@RequestBody CheckApplication checkApplication){
        //
        checkApplication.setUseState("1");
        checkApplication.setState("1");
        //创建这个申请的门诊医生
        checkApplication.setOutpatientDoctorNo(getDoctorID());
        checkApplication.setId(null);
        checkApplication.setCreateTime(new DateTime());
        checkApplication.setDepartmentName(getDePartMentName());
        checkApplication.setIsFee("1");
        checkApplication.setPrice(0.00);
        checkApplication.setOutpatientDoctorName(this.getDoctorName());
        //服务器不能获得的数据
//        checkApplication.setRegistrationInfoNo();
//        checkApplication.setMedicalRecord();
        od_CheckServer.postNewCheckApplication(checkApplication);
        return  new Result(ResultCode.SUCCESS);
    }

    @ApiOperation(value = "",notes = "传入一个检查申请,检查的项目!需要把这个表的id绑定在检查申请表中检查项目中," +
            "其中检查申请的id由创建的检查项目的id获得，仅仅作为一个传送值的属性Integer checkApplicationID = checkItem.getId();" +
            "然后再返回创建的这个id给vue")
    @PostMapping(value = "/postNewCheckItem")
    public Result postNewCheckItem(@RequestBody CheckItem checkItem){
        //获得检查申请的id
        Integer checkApplicationID = checkItem.getId();
        checkItem.setId(null);
        checkItem.setCreateTime(new DateTime());
        checkItem.setItemHandleState("1");
        int checkItemID = od_CheckServer.postNewCheckItem(checkItem,checkApplicationID);
        return  new Result(ResultCode.SUCCESS,checkItemID);
    }

    @ApiOperation(value = "",notes = "接收一个自定义checkTpemlate模板对象进行把模板内容保存在数据库中")
    @PostMapping(value = "/postNewCheckTemplate")
    public Result postNewCheckTemplate(@RequestBody AcceptCheckTemplate acceptCheckTemplate) {

        CheckStack checkStack = acceptCheckTemplate.getCheckStack();
        checkStack.setCreateTime(new DateTime());
        checkStack.setDepartmentNo("" + getDoctorDePartMentID());
        checkStack.setState("1");
        checkStack.setCheckType("1");
        checkStack.setOutpatientDoctorNo(getDoctorID());
        od_CheckServer.postNewCheckTemplate(acceptCheckTemplate);
        return new Result(ResultCode.SUCCESS);
    }
    @ApiOperation(value = "",notes = "接收一个自定义checkTpemlate模板对象进行把模板内容保存在数据库中")
    @PostMapping(value = "/postNewInspectTemplate")
    public Result postNewInspectTemplate(@RequestBody AcceptCheckTemplate acceptCheckTemplate) {
        CheckStack checkStack = acceptCheckTemplate.getCheckStack();
        checkStack.setCreateTime(new DateTime());
        checkStack.setDepartmentNo("" + getDoctorDePartMentID());
        checkStack.setState("1");
        checkStack.setCheckType("2");
        checkStack.setOutpatientDoctorNo(getDoctorID());
        od_CheckServer.postNewCheckTemplate(acceptCheckTemplate);
        return new Result(ResultCode.SUCCESS);
    }
    @ApiOperation(value = "",notes = "接收一个自定义checkTpemlate模板对象进行把模板内容保存在数据库中")
    @PostMapping(value = "/postNewDisposeTemplate")
    public Result postNewDisposeTemplate(@RequestBody AcceptCheckTemplate acceptCheckTemplate) {

        CheckStack checkStack = acceptCheckTemplate.getCheckStack();
        checkStack.setCreateTime(new DateTime());
        checkStack.setDepartmentNo("" + getDoctorDePartMentID());
        checkStack.setState("1");
        checkStack.setCheckType("3");
        checkStack.setOutpatientDoctorNo(getDoctorID());
        od_CheckServer.postNewCheckTemplate(acceptCheckTemplate);
        return new Result(ResultCode.SUCCESS);
    }


    @ApiOperation(value = "",notes = "获得已经执行之后的item的result以及result的结果图片")
    @GetMapping(value = "/getItemResult")
    public Result getItemResult(String id){
        List<Object> list = od_CheckServer.getItemResult(id);
        //3.返回结果
        return new Result(ResultCode.SUCCESS,list);
    }


//    -----------模板


    @ApiOperation(value = "",notes = "获得医生创建的所有的检查申请的模板")
    @GetMapping(value = "/getCheckTemplateByDoctorID")
    public Result getCheckTemplateByDoctorID(String type){
        //type == 1是表示检查  type==2是表示检验 type=3是处置
        List<CheckStack>  list = od_CheckServer.getCheckTemplateByDoctorID(getDoctorID(),type);
        //3.返回结果
        return new Result(ResultCode.SUCCESS,list);
    }

    @ApiOperation(value = "",notes = "获得全院创建的所有的门诊首页的模板")
    @GetMapping(value = "/getCheckTemplateAll")
    public Result getCheckTemplateAll(String type){

        List<CheckStack>  list = od_CheckServer.getCheckTemplateAll(type);
        //3.返回结果
        return new Result(ResultCode.SUCCESS,list);
    }

    @ApiOperation(value = "",notes = "获得医生本院创建的所有的检查申请的模板")
    @GetMapping(value = "/getCheckTemplateAllDeID")
    public Result getCheckTemplateAllDeID(String type){

        List<CheckStack>  list = od_CheckServer.getCheckTemplateAllDeID(getDoctorDePartMentID(),type);
        //3.返回结果
        return new Result(ResultCode.SUCCESS,list);
    }

    //检查申请
    @ApiOperation(value = "",notes = "医生添加病人的检查申请，创建一个检查申请的数据，需要传入检查申请的对象数据" +
            "一个检查申请的话是需要传入检查项目的哦，也就是传入一个map对象，然后解析成二个对象")
    @PostMapping(value = "/postCheckApplication")
    public Result postCheckApplication(@RequestBody String params){

        JSONObject j1 = JSONObject.parseObject(params);
        CheckApplication check = JSONObject.parseObject(j1.getJSONObject("checkApplication").toJSONString(),CheckApplication.class);
        check.setCreateTime(new DateTime());
        check.setId(null);
        check.setUseState("2");
        check.setOutpatientDoctorNo(getDoctorID());

        List<CheckItem> checkItem = JSONObject.parseArray(j1.getJSONArray("list").toJSONString(), CheckItem.class);

        checkItem.forEach(value -> {
            System.out.println(value.toString());
            value.setCreateTime(new DateTime());
        });

        od_CheckServer.postCheckApplication(check,checkItem);

        return new Result(ResultCode.SUCCESS);
    }


    @ApiOperation(value = "",notes = "获得全院检查申请项目,2是检查")
    @GetMapping(value = "/getCheckFemdItem")
    public Result getCheckFemdItem(){
        List<FmedItem> list = od_CheckServer.getCheckFemdItem();
        return new Result(ResultCode.SUCCESS,list);
    }

    @ApiOperation(value = "",notes = "通过codes （34324|32432）")
    @GetMapping(value = "/getFemdItemDataByFemdCodes")
    public Result getFemdItemDataByFemdCodes(String codes){
        List<FmedItem> list = od_CheckServer.getFemdItemDataByFemdCodes(codes);
        return new Result(ResultCode.SUCCESS,list);
    }

}
