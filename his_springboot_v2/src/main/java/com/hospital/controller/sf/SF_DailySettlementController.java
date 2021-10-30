package com.hospital.controller.sf;

import com.hospital.model.DailyDetail;
import com.hospital.model.DailySettlement;
import com.hospital.service.sf.SF_DailySettlementService;
import com.hospital.utils.Result;
import com.hospital.utils.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Api(value = "用户的接口",tags={"会龙负责的门诊医生所需的api文档"})
@RestController
@RequestMapping("/sf")
@CrossOrigin
public class SF_DailySettlementController {
    @Resource
    SF_DailySettlementService dailySettlementService;


    @ApiOperation(value = "", notes = "查看所有日结信息")
    @GetMapping("/listDailySettlement")
    public Result listDailySettlement() {
        List<DailySettlement> dailySettlements = dailySettlementService.listDailySettlement ();
        return new Result (ResultCode.SUCCESS, dailySettlements);
    }

    @ApiOperation(value = "", notes = "通过挂号员id，以及起始时间和截止时间把所在这个时间段内的检查收费表，药品收费表，挂号表里面的费用信息全部查找出来" +
            "并将起始时间、截止时间、挂号员id、挂号员姓名插入到日结表中，将收费信息插入到明细表中")
    @GetMapping("/listDailyDetailByRegistrar")
    public Result listDailyDetailByRegistrar(@RequestParam("startDate") String startDate, @RequestParam("endDate") String endDate, @RequestParam("id") String id) throws ParseException {
        String substring = startDate.substring (0, 10);
        System.out.println (substring);
        DateFormat format = new SimpleDateFormat ("yyyy-MM-dd");

        Date s = null;
        try {
            s = format.parse (substring);
        } catch (ParseException e) {
            e.printStackTrace ();
        }
        String e = endDate.substring (0, 10);

        System.out.println (e);
        Date f = format.parse (e);

        dailySettlementService.listDailyDetailByRegistrar (s, f, id);
        return new Result (ResultCode.SUCCESS);
    }

    @ApiOperation(value = "", notes = "通过挂号员id，查找明细表里的内容")
    @GetMapping("/listDailyDetailByRegistrarNo")
    public Result listDailyDetailByRegistrarNo(Integer dailySettlementNo) {
        List<DailyDetail> dailyDetails = dailySettlementService.listDailyDetailByRegistrarNo (dailySettlementNo);
        return new Result (ResultCode.SUCCESS, dailyDetails);
    }

}

