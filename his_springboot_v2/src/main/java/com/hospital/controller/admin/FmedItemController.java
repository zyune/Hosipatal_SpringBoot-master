package com.hospital.controller.admin;

import com.hospital.model.FmedItem;
import com.hospital.service.admin.FmedItemService;
import com.hospital.utils.Result;
import com.hospital.utils.ResultCode;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/*
 * @Author 邵婷
 * @Date 2019/6/22 10:18
 * @Version 1.0*/

@RestController
@RequestMapping("/ad")
@Api(tags = {"邵婷负责的管理员FemdItem管理所需的api文档"})
public class FmedItemController {
    @Resource
    FmedItemService fmedItemService;

    @GetMapping("/findAllFemdItems")
    public Result findAll(){
        List<FmedItem> fmedItems = fmedItemService.findAll();
        for(FmedItem fmedItem:fmedItems){
            System.out.println(fmedItem);
        }
        return new Result(ResultCode.SUCCESS,fmedItems);
    }

    @PostMapping("/addFmeditem")
    public Result addFmeditem(@RequestBody FmedItem fmedItem){
        fmedItemService.addFmeditem(fmedItem);
        return new Result(ResultCode.SUCCESS);
    }

    @PutMapping("/updataFmeditem")
    public Result updataFmeditem(@RequestBody FmedItem fmedItem){
        fmedItemService.updataFmeditem(fmedItem);
        return new Result(ResultCode.SUCCESS);

    }





}
