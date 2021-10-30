package com.hospital.controller.sf;

import com.hospital.model.Drugs;
import com.hospital.model.FmedItem;
import com.hospital.service.sf.SF_DrugsService;
import com.hospital.utils.Result;
import com.hospital.utils.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(value = "用户的接口",tags={"会龙负责的门诊医生所需的api文档"})
@RestController //全部以JSON数据格式进行回复
@RequestMapping("/sf")
public class SF_DrugsController {
    @Resource
    SF_DrugsService drugsService;


    @ApiOperation(value = "",notes = "查看所有的药品信息")
    @GetMapping("/listDrugs")
    public Result listDrugs(){
        List<Drugs> drugs = drugsService.listDrugs ();
        return new Result(ResultCode.SUCCESS, drugs);
    }


    @ApiOperation(value = "",notes = "通过药品名称查看所有的药品信息")
    @GetMapping("/listDrugsByDrugsName")
    public @ResponseBody
    Result listDrugsByDrugsName(String drugsName){
        List<Drugs> drugs = drugsService.listDrugsByDrugsName (drugsName);
        return new Result(ResultCode.SUCCESS, drugs);
    }


    @ApiOperation(value = "",notes = "通过传入的药品费用表,修改价格")
    @PutMapping(value = "/putDrugsUseDrugsPrice")
    public Result putDrugsUseDrugsPrice(@RequestBody Drugs drug){
        drugsService.putDrugsUseDrugsPrice(drug);
        return  new Result(ResultCode.SUCCESS);
    }



    @ApiOperation(value = "",notes = "查看所有的非药品药品信息")
    @GetMapping("/listFmedItem")
    public Result listFmedItem(){
        List<FmedItem> fmedItems = drugsService.listFmedItem ();
        return new Result(ResultCode.SUCCESS, fmedItems);
    }
    @ApiOperation(value = "",notes = "通过药品名称查看所有的药品信息")
    @GetMapping("/listFmedItemByItemname")
    public @ResponseBody Result listFmedItemByItemname(String itemname){
        List<FmedItem> fmedItems = drugsService.listFmedItemByItemname (itemname);
        return new Result(ResultCode.SUCCESS, fmedItems);
    }

    @ApiOperation(value = "",notes = "通过药品名称查看所有的药品信息" +
            "项目类型1是处置，二是检查，3是检验 ,返回类型为list")
    @GetMapping("/listFmedItemByRecordtype")
    public Result listFmedItemByRecordtype(Integer recordtype){
        List<FmedItem> fmedItems = drugsService.listFmedItemByRecordtype (recordtype);
        return  new Result(ResultCode.SUCCESS,fmedItems);
    }

    @ApiOperation(value = "",notes = "通过传入的药品费用表,修改价格")
    @PutMapping(value = "/ putFmedItemUseprice")
    public Result  putFmedItemUseprice(@RequestBody FmedItem fmedItem){
        drugsService.putFmedItemUseprice(fmedItem);
        return  new Result(ResultCode.SUCCESS);
    }
}
