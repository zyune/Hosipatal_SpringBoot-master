package com.hospital.controller.admin;


import com.hospital.model.SchedulingRule;
import com.hospital.service.admin.SchedulingService;
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
@Api(tags = {"邵婷负责的管理员排班规则管理所需的api文档"})
public class SchedulingController {

    @Resource
    SchedulingService schedulingService;

    @GetMapping("/schedulingList")
    public Result schedulingList(){
        List<SchedulingRule>  schedulingRules = schedulingService.findAll();
            for(SchedulingRule schedulingRule:schedulingRules){
               String week = schedulingRule.getWeek();
                switch (week){
                   case "1" :
                       schedulingRule.setWeek("星期一");
                       break;
                   case "2" :
                       schedulingRule.setWeek("星期二");
                       break;
                   case "3" :
                       schedulingRule.setWeek("星期三");
                       break;
                   case "4" :
                       schedulingRule.setWeek("星期四");
                       break;
                   case "5" :
                       schedulingRule.setWeek("星期五");
                       break;
                   case "6" :
                       schedulingRule.setWeek("星期六");
                       break;
                   case "7" :
                       schedulingRule.setWeek("星期日");
                       break;
               }

                System.out.println(schedulingRule);
            }
            return new Result(ResultCode.SUCCESS,schedulingRules);

    }

    @PostMapping("/addSchedulingrule")
    public Result addSchedulingrule(@RequestBody SchedulingRule schedulingRule){
        schedulingService.addShedulingrule(schedulingRule);
        return new Result(ResultCode.SUCCESS);
    }

     @PutMapping("/updataSchedulrule")
    public Result updataSchedulrule(@RequestBody SchedulingRule schedulingRule){
        String week1 = schedulingRule.getWeek();
        switch (week1){
            case "星期一" :
                schedulingRule.setWeek("1");
                break;
            case "星期二" :
                schedulingRule.setWeek("2");
                break;
            case "星期三" :
                schedulingRule.setWeek("3");
                break;
            case "星期二四" :
                schedulingRule.setWeek("4");
                break;
            case "星期五" :
                schedulingRule.setWeek("5");
                break;
            case "星期六" :
                schedulingRule.setWeek("6");
                break;
            case "星期日" :
                schedulingRule.setWeek("7");
                break;
        }
        schedulingService.updataSchedulrule(schedulingRule);
        return new Result(ResultCode.SUCCESS);
     }


    @DeleteMapping("/delSchedulrule")
    public Result delSchedulrule( SchedulingRule schedulingRule){
        schedulingService.delSchedulrule(schedulingRule);
        return  new Result(ResultCode.SUCCESS);
    }


}
