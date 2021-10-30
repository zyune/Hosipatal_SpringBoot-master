package com.hospital.controller.md;


import com.hospital.model.CheckApplication;
import com.hospital.model.CheckItem;
import com.hospital.model.CheckResult;
import com.hospital.service.md.YJ_DisposeService;
import com.hospital.utils.Result;
import com.hospital.utils.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dispose")
@Api(value = "  检验的接口",tags={"尹峥负责的医技检验所需的api文档"})
public class YJ_DisposeController {
    @Autowired
    YJ_DisposeService yj_disposeService;

    @ApiOperation(value = "getWaitYjPatient",notes = " 获得检查申请表当中的病人")
    @GetMapping("/getWaitYjPatient")
    public Result getWaitFyPatient(){
        // 获得 西药申请表创建时间为  今天，已经付费
        List<CheckApplication> w = yj_disposeService.getWaitYjPatient();
        return new Result(ResultCode.SUCCESS,w);
    }

    @ApiOperation(value = "getPatientSexAndAge",notes = " 根据检查申请表中病人的病历号，获得挂号表表当中的病人的性别和年龄，需要用到挂号表中的信息")
    @GetMapping("/getPatientSexAndAge")
    public Result getPatientSexAndAge(String medicalRecord){
        Map<String,String> res = yj_disposeService.getPatientSexAndAge(medicalRecord);
        return new Result(ResultCode.SUCCESS,res);
    }
    @ApiOperation(value = "getPatientOtherInfo",notes = " 获得检查申请表当中的病人的其余信息，如姓名等 ")
    @GetMapping("/getPatientOtherInfo")
    public  Result getPatientOtherInfo(String id){
        Map<String,String> res=yj_disposeService.getPatientOtherInfo(id);
        return new Result(ResultCode.SUCCESS,res);

    }
    @ApiOperation(value = "getCheckItem",notes = " 根据病人的检查项目申请单，得到checkitem表当中病人的检查项目 和fmed里面改项目的具体信息")
    @GetMapping("/getCheckItem")
    public  Result getCheckItem(String id){
        List<CheckItem> res=yj_disposeService.getCheckItem(id);
        return new Result(ResultCode.SUCCESS,res);
    }
    @ApiOperation(value = "putItemHandleState",notes = "点击录入以后把传入的该行的检查项目的处置状态改为3")
    @PutMapping("/putItemHandleState")
    public Result putItemHandleState(@RequestBody String id){
        yj_disposeService.putItemHandleState(id);
        return new Result(ResultCode.SUCCESS);
    }
    @ApiOperation(value = "postCheckResult",notes = "点击添加按钮以后吧结果录入到checkresult表中")
    @PostMapping("/postCheckResult")
    public Result postCheckResult(@RequestBody CheckResult checkResult){
        checkResult.setId(null);
        yj_disposeService.postCheckResult(checkResult);
        return new Result(ResultCode.SUCCESS);
    }
}
