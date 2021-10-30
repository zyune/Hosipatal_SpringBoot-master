package com.hospital.controller.admin;

import com.hospital.model.SchedulingInfo;
import com.hospital.service.admin.SchedulinfoService;
import com.hospital.utils.Result;
import com.hospital.utils.ResultCode;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/*
 * @Author 邵婷
 * @Date 2019/6/22 10:18
 * @Version 1.0*/

@RestController
@RequestMapping("/ad")
@Api(tags = {"邵婷负责的管理员排班管理所需的api文档"})
public class SchedulInforController {
    @Resource
    SchedulinfoService schedulinfoService;

    @GetMapping("/schedulInfoList")
    public Result schedulInfoList(){
        List<SchedulingInfo> schedulingInfos = schedulinfoService.findAll();
        for(SchedulingInfo schedulingInfo : schedulingInfos){
            System.out.println(schedulingInfo);
        }
        return new Result(ResultCode.SUCCESS,schedulingInfos);
    }

    @PostMapping("/addShedulingrule")
    public Result addShedulingrule(@RequestBody SchedulingInfo schedulingInfo){
        schedulinfoService.addShedulInfor(schedulingInfo);
        return new Result(ResultCode.SUCCESS);
    }

       @PostMapping("/addShedulinginfoList")
    public Result addShedulinginfoList(@RequestBody SchedulingInfo schedulingInfo){
        schedulinfoService.addShedulInfor(schedulingInfo);
        return new Result(ResultCode.SUCCESS);
    }

    @PostMapping("/addAllShedulinginfoList")
    public Result addAllShedulinginfoList(@RequestBody SchedulingInfo[] schedulingInfos){
        for(SchedulingInfo info:schedulingInfos) {
            schedulinfoService.addShedulInfor(info);
        }
        return new Result(ResultCode.SUCCESS);
    }


    @PutMapping("/updataSchedulInfor")
    public Result updataSchedulInfor(@RequestBody SchedulingInfo schedulingInfo){
        schedulinfoService.updataSchedulInfor(schedulingInfo);
        return  new Result(ResultCode.SUCCESS);
    }

    @GetMapping("/getSchedulingInfoLastDate")
    public Result getSchedulingInfoLastDate(){
        Date d = schedulinfoService.getchedulingInfoLastDate();
        return new Result(ResultCode.SUCCESS,d);
    }
    @DeleteMapping("/delSchedulInfor")
    public Result delSchedulInfor(SchedulingInfo schedulingInfo){
        schedulinfoService.delSchedulInfor(schedulingInfo);

        return new Result(ResultCode.SUCCESS);
    }



}
