package com.hospital.controller.od;

import cn.hutool.core.date.DateTime;
import com.hospital.model.Drugs;
import com.hospital.model.HerbalApplication;
import com.hospital.model.User;
import com.hospital.model.od.HerbalAppliacationSUm;
import com.hospital.service.od.Od_HerbalServer;
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

import java.util.List;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName Od_HerbalController
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/24 18:20
 * @Version 1.0
 **/
@Api(value = "用户的接口",tags={"方聪负责的门诊医生药品申请所需的api文档"})
@RestController //全部以JSON数据格式进行回复
@RequestMapping("/od")
@CrossOrigin
public class Od_HerbalController {

    private Logger logger = LoggerFactory.getLogger(Od_MedicalRecordController.class);
//    @Autowired
//    Od_MedicalRecordServer od_medicalRecordServer;
    @Autowired
Od_HerbalServer od_herbalServer;
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

    //加载获得所有数据
    @ApiOperation(value = "",notes = "通过病人的病历号，获得该医生对应的药品申请的信息，并且在list申请中具有该对应的申请项目的list数据" +
            "这样的数据[{[{},{}]},{[{},{}]}]")
    @GetMapping(value = "/getHerbalApplicationByblh")
    public Result getHerbalApplicationByblh(String blh){
        List<HerbalAppliacationSUm> list = od_herbalServer.getHerbalApplicationByblh(blh,"1");
        return new Result(ResultCode.SUCCESS,list);
    }
    @ApiOperation(value = "",notes = "通过病人的病历号，获得该病人对应的list申请，并且在list申请中具有该对应的申请项目的list数据" +
            "这样的数据[{[{},{}]},{[{},{}]}]")
    @GetMapping(value = "/getMedicineApplicationByblh")
    public Result getMedicineApplicationByblh(String blh){
        List<HerbalAppliacationSUm> list = od_herbalServer.getHerbalApplicationByblh(blh,"2");
        return new Result(ResultCode.SUCCESS,list);
    }
    //查询项目数据通过名称
    @ApiOperation(value = "",notes = "获得全院药品,1是中药,通过name进行搜索")
    @GetMapping(value = "/getHerbalDrugsByName")
    public Result getHerbalDrugsByName(String name){
        List<Drugs> list = od_herbalServer.getHerbalDrugsByName(name,"1");
        return new Result(ResultCode.SUCCESS,list);
    }

    @ApiOperation(value = "",notes = "获得全院药品,1是中药,通过name进行搜索")
    @GetMapping(value = "/getMedicineDrugsByName")
    public Result getMedicineDrugsByName(String name){
        List<Drugs> list = od_herbalServer.getHerbalDrugsByName(name,"2");
        return new Result(ResultCode.SUCCESS,list);
    }
    //暂存项目
    @ApiOperation(value = "",notes = "获得全院药品,1是中药,通过name进行搜索")
    @PutMapping(value = "/putHerbalApplicationUseStateToSave")
    public Result putHerbalApplicationUseStateToSave(@RequestBody HerbalAppliacationSUm herbalAppliacationSUm){
        List<Drugs> list = od_herbalServer.putHerbalApplicationUseStateToSave(herbalAppliacationSUm);
        return new Result(ResultCode.SUCCESS);
    }

    @ApiOperation(value = "",notes = "修改申请名称和申请的要求，传入String[] 0 1 2 2表示申请的id")
    @PutMapping(value = "/sureAlertHerbalAppliction")
    public Result sureAlertHerbalAppliction(@RequestBody HerbalApplication herbalApplication){
        od_herbalServer.sureAlertAppliction(herbalApplication);
        return  new Result(ResultCode.SUCCESS);
    }


    @ApiOperation(value = "",notes = "通过传入药品申请id,删除该id中药品项目")
    @DeleteMapping (value = "/deleteHerbalItemByHerbalApplicationID")
    public Result deleteHerbalItemByHerbalApplicationID( String herbalID,String itemID){
        od_herbalServer.deleteHerbalItemByHerbalApplicationID(herbalID,itemID);
        return new Result(ResultCode.SUCCESS,null);
    }

    @ApiOperation(value = "",notes = "获得全院药品,1是中药,通过name进行搜索")
    @GetMapping(value = "/getMedicineItemByName")
    public Result getMedicineItemByName(String name){
        List<Drugs> list = od_herbalServer.getMedicineDrugsByName(name,"2");
        return new Result(ResultCode.SUCCESS,list);
    }

    //申请一个新的申请
    @ApiOperation(value = "",notes = "传入创建信息创建一个新的HerbalApplication以及生成对应的项目")
    @PostMapping(value = "/postNewHerbalApplication")
    public Result postNewHerbalApplication(@RequestBody HerbalApplication herbalApplication){
        //
        herbalApplication.setUseState("1");
        herbalApplication.setState("1");
        //创建这个申请的门诊医生
        herbalApplication.setOutpatientDoctorNo(getDoctorID());
        herbalApplication.setId(null);
        herbalApplication.setCreateTime(new DateTime());
        herbalApplication.setDepartmentName(getDePartMentName());
        herbalApplication.setIsFee("1");
        herbalApplication.setHandleState("1");
        herbalApplication.setPrice(0.00);
        herbalApplication.setOutpatientDoctorName(this.getDoctorName());
        od_herbalServer.postNewHerbalApplication(herbalApplication);

        return  new Result(ResultCode.SUCCESS);
    }

    @ApiOperation(value = "",notes = "通过传入药品申请表的id,修改useState由1变成2")
    @PutMapping(value = "/putHerbalApplicationUseStateToOk")
    public Result putHerbalApplicationUseStateToOk(@RequestBody String id){
        od_herbalServer.putHerbalApplicationUseStateToOk(id);
        return  new Result(ResultCode.SUCCESS);
    }

    @ApiOperation(value = "",notes = "通过传入药品申请表的id,修改useState由1变成2")
    @PutMapping(value = "/putHerbalApplicationUseStateToDelete")
    public Result putHerbalApplicationUseStateToDelete(@RequestBody String id){
        od_herbalServer.putHerbalApplicationUseStateToDelete(id);
        return  new Result(ResultCode.SUCCESS);
    }


}
