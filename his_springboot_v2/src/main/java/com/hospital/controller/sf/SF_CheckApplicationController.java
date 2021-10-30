package com.hospital.controller.sf;

import com.hospital.model.CheckApplication;
import com.hospital.model.CheckFee;
import com.hospital.service.sf.SF_CheckApplicationService;
import com.hospital.utils.Result;
import com.hospital.utils.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(value = "用户的接口",tags={"会龙负责的门诊医生所需的api文档"})
@RestController
@RequestMapping("/sf")
@CrossOrigin
public class SF_CheckApplicationController {
    @Resource
    SF_CheckApplicationService checkApplicationService;

    @ApiOperation(value = "",notes ="查看所有病人的检查信息")
    @GetMapping("/listCheck")
    public Result listCheck(){
        List<CheckApplication> ua = checkApplicationService.listCheck ();
        return new Result(ResultCode.SUCCESS, ua);

    }
    @ApiOperation(value = "",notes = "通过姓名进行查找信息")
    @GetMapping("/listPatientName")
    public Result listPatientName(String patientName){
        List<CheckApplication> checkApplications = checkApplicationService.listPatientName (patientName);
        return new Result (ResultCode.SUCCESS,checkApplications);

    }
    @ApiOperation(value = "",notes = "将结算后信息插入进去")
    @PostMapping("/addCheckFee")
    public Result addCheckFee(@RequestBody CheckFee checkFee) {
        checkApplicationService.addCheckFee(checkFee);
        return new Result(ResultCode.SUCCESS);
    }


    @ApiOperation(value = "",notes = "查看所有病人的检查收费信息")
    @GetMapping("/listAllCheckFee")
    public Result listAllCheckFee(){
        List<CheckFee> checkFees = checkApplicationService.listAllCheckFee ("1");
        return new Result(ResultCode.SUCCESS,checkFees);

    }
    @ApiOperation(value = "",notes = "查看所有病人的检验收费信息")
    @GetMapping("/listAllInspectionFee")
    public Result listAllInspectionFee(){
        List<CheckFee> checkFees = checkApplicationService.listAllCheckFee ("2");
        return new Result(ResultCode.SUCCESS,checkFees);

    }
    @ApiOperation(value = "",notes = "查看所有病人的处置收费信息")
    @GetMapping("/listAllDisposeFee")
    public Result listAllDisposeFee(){
        List<CheckFee> checkFees = checkApplicationService.listAllCheckFee ("3");
        return new Result(ResultCode.SUCCESS,checkFees);

    }
    @ApiOperation(value = "",notes = "通过病人姓名所有病人的检查收费信息")
    @GetMapping("/listCheckFeeByPatientName")
    public Result listCheckFeeByPatientName(String patientName){
        List<CheckFee> checkFees = checkApplicationService.listCheckFeeByPatientName (patientName,"1");
        return new Result (ResultCode.SUCCESS,checkFees);
    }

    @ApiOperation(value = "",notes = "通过病人姓名所有病人的检验收费信息")
    @GetMapping("/listInspectionFeeByPatientName")
    public Result listInspectionFeeByPatientName(String patientName){
        List<CheckFee> checkFees = checkApplicationService.listCheckFeeByPatientName (patientName,"2");
        return new Result (ResultCode.SUCCESS,checkFees);
    }

    @ApiOperation(value = "",notes = "通过病人姓名所有病人的处置收费信息")
    @GetMapping("/listDisposeFeeByPatientName")
    public Result listDisposeFeeByPatientName(String patientName){
        List<CheckFee> checkFees = checkApplicationService.listCheckFeeByPatientName (patientName,"3");
        return new Result (ResultCode.SUCCESS,checkFees);
    }

}
