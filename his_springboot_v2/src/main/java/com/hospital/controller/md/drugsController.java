package com.hospital.controller.md;

import com.hospital.mapper.DrugsMapper;
import com.hospital.model.Drugs;
import com.hospital.service.md.Drugs_Service;
import com.hospital.utils.Result;
import com.hospital.utils.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/drugs")
@Api(value = "  发药的接口",tags={"尹峥负责的发药所需的api文档"})
public class drugsController {
    @Autowired
    Drugs_Service drugs_service;
    @ApiOperation(value = "getAllDrugs",notes = " 获得 drugs表中所有信息")
    @GetMapping("/getAllDrugs")
    public Result getAllDrugs(){
        List<Drugs> drugs = drugs_service.getAllDrugs();
    return new Result(   ResultCode.SUCCESS,drugs);

    }

    @ApiOperation(value = "addDrug",notes = " 添加一条药物信息到药物表中")
    @PostMapping("/addDrug")
    public Result addDrug(@RequestBody Drugs drug){
        drug.setId(null);
        drugs_service.addDrug(drug);
        return new Result(ResultCode.SUCCESS);
    }
    @ApiOperation(value = "deleteDrugByCode",notes = " 从药物表中删除一条")
    @DeleteMapping("/deleteDrugByCode")
    public Result deleteDrugByCode( String drugCode){
        drugs_service.deleteDrugByCode(drugCode);
        return new Result(ResultCode.SUCCESS);
    }
    @ApiOperation(value = "getDrugByCode",notes = " 根据输入的药物编码，从药物表中找到该条药物信息")
    @GetMapping("/getDrugByCode")
    public Result getDrugsByCode(String drugCode){
        Map<String,String> res=drugs_service.getDrugByCode(drugCode);
        return new Result(ResultCode.SUCCESS,res);
    }
    @ApiOperation(value ="changeDrug",notes = " 传入一个的对象，修改药物的信息")
    @PutMapping("changeDrug")
    public Result changDrug(@RequestBody Drugs drugs){
        drugs_service.changeDrug(drugs);
        return new Result(ResultCode.SUCCESS);
    }

    @ApiOperation(value = "getDrugByCode1",notes = " 输入药品的code，并显示到药品列表  区别于getDrugByCOde")
    @GetMapping("/getDrugByCode1")
    public Result getDrugByCode1(String drugCode){
        List<Drugs> w = drugs_service.getDrugByCode1(drugCode);
        return new Result(ResultCode.SUCCESS,w);
    }
}
