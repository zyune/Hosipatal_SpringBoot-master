package com.hospital.controller.md;

import com.hospital.model.MedicinePrescriptionApplication;
import com.hospital.model.MedicinePrescriptionDrugsCopy1;
import com.hospital.service.md.Md_MenjiService;
import com.hospital.utils.Result;
import com.hospital.utils.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/md")
@Api(value = "  发药的接口",tags={"尹峥负责的发药所需的api文档"})
public class Md_MenjiController {

    @Autowired
    Md_MenjiService md_menjiService;

    @ApiOperation(value = "getWaitFyPatient",notes = " 获得 西药申请表创建时间为  今天，已经付费")
    @GetMapping("/getWaitFyPatient")
    public Result getWaitFyPatient(){
        // 获得 西药申请表创建时间为  今天，已经付费
        List<MedicinePrescriptionApplication> w = md_menjiService.getWaitFyPatient();
        return new Result(ResultCode.SUCCESS,w);
    }
    @ApiOperation(value = "getWaitFyPatientById",notes = " 输入病人的病历号茶轩到改病历号的病人，并显示到病人列表")
    @GetMapping("/getWaitFyPatientById")
    public Result getWaitFyPatientById(String medicalRecord){
        List<MedicinePrescriptionApplication> w = md_menjiService.getWaitFyPatientById(medicalRecord);
        return new Result(ResultCode.SUCCESS,w);
    }

    @ApiOperation(value = "getPatientOtherInfo",notes = " 获得 medicine-application表其他信息如 病历号，姓名，就诊科室，处方状态（state），收费日期")
    @GetMapping("/getPatientOtherInfo")
    public Result getPatientOtherInfo(String blh){
        Map<String,String> res1= md_menjiService.getPatientOtherInfo(blh);
        return new Result(ResultCode.SUCCESS,res1);
    }


    @ApiOperation(value = "getPatientAgeAndSex",notes = "通过病历号（registration——info）查询到患者的年龄性别")
    @GetMapping("/getPatientAgeAndSex")
    public Result getPatientAgeAndSex(String blh){
        Map<String,String> res = md_menjiService.getPatientAgeAndSex(blh);
        return new Result(ResultCode.SUCCESS,res);

    }
    @ApiOperation(value = "getDrugs",notes = "通过药物申请表查到 处方号 和开单医生")
    @GetMapping("/getDrugs")
    public  Result getDrugs(String blh){
        List<MedicinePrescriptionApplication> w=md_menjiService.getDrugs(blh);
        return new Result(ResultCode.SUCCESS,w);
    }
    @ApiOperation(value = "getDrugsDetail",notes = "通过药物表查到 发药明细信息如药品名称，规格，数量")
    @GetMapping("/getDrugsDetail")
    public Result getDrugsDetail(String cfh){
        List<MedicinePrescriptionDrugsCopy1> w=md_menjiService.getDrugsDetail(cfh);
        return new Result(ResultCode.SUCCESS,w);
    }


    @ApiOperation(value = "putDistState",notes = "点击发药按钮完成发药操作，把药物申请表的disribution——state值改为已发1")
    @PutMapping("/putDistState")
    public  Result putDistState(@RequestBody String cfh){
        md_menjiService.putDistState(cfh);
        return new Result(ResultCode.SUCCESS);
    }

}

