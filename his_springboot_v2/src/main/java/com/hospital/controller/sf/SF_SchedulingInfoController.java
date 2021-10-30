package com.hospital.controller.sf;

import com.hospital.service.sf.SF_SchedulingInfoService;
import com.hospital.utils.Result;
import com.hospital.utils.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;

@Api(value = "用户的接口",tags={"会龙负责的门诊医生所需的api文档"})
@RestController //全部以JSON数据格式进行回复
@RequestMapping("/sf")
@CrossOrigin
public class SF_SchedulingInfoController {
    @Resource
    SF_SchedulingInfoService schedulingInfoService;

    @ApiOperation(value = "",notes = "通过判断当天时间以及排班类型，获得当天的排班信息")
    @GetMapping("/getSchedulingInfoByDay")
    public Result getSchedulingInfoByDay(String day) {
        ArrayList<Object> schedulingRuleByDay = schedulingInfoService.getSchedulingInfoByDay(day);
        return new Result(ResultCode.SUCCESS, schedulingRuleByDay);
    }


}
