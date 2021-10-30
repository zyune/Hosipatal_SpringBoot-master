package com.hospital.controller.sf;

import com.hospital.model.RegistrationInfo;
import com.hospital.model.RegistrationLevel;
import com.hospital.service.sf.SF_RegistrationService;
import com.hospital.service.sf.SF_SerialNumberService;
import com.hospital.utils.Result;
import com.hospital.utils.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;

@Api(value = "用户的接口",tags={"会龙负责的门诊医生所需的api文档"})
@RestController //全部以JSON数据格式进行回复
@RequestMapping("/sf")
@CrossOrigin
public class SF_RegistrationController {


    @Resource
    SF_RegistrationService registrationInfoService;

    @Resource
    SF_SerialNumberService serialNumberService;


        @ApiOperation(value = "",notes = "对挂号成功的病人通过病历号进行查询，将结果返回到列表")
        @GetMapping("getRegistrationByMedicalRecord")
        public @ResponseBody Result getRegistrationByMedicalRecord(String medicalRecord){
            List<RegistrationInfo> list  = registrationInfoService.getRegistrationByMedicalRecord(medicalRecord);
            return new Result(ResultCode.SUCCESS, list.get(0));
        }

    @ApiOperation(value = "",notes = "获得病历号")
    @GetMapping("/generateRegistrationId")
    public Result generateRegistrationId() {
        String strSerialNumber = null;
        try {
            strSerialNumber = serialNumberService.generateRegistrationId();
            System.out.println(strSerialNumber);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Result(ResultCode.SUCCESS, strSerialNumber);
    }

    @ApiOperation(value = "",notes = "查看所有的挂号等级信息")
    @GetMapping("/listRegistrationLevel")
    public Result listRegistrationLevel() {
        List<RegistrationLevel> ua = registrationInfoService.listRegistrationLevel();
        for (RegistrationLevel registrationLevel : ua) {
            System.out.println(registrationLevel);
        }
        return new Result(ResultCode.SUCCESS, ua);

    }
    @ApiOperation(value = "",notes = "添加所有到挂号表中")
    @PostMapping("/addRegistration")
    public Result addRegistration(@RequestBody RegistrationInfo registrationInfo) {
        registrationInfoService.addRegistration(registrationInfo,"ry989",18);
        return new Result(ResultCode.SUCCESS);
    }


    @ApiOperation(value = "listRegistration",notes = "查看所有到挂号表中")
    @GetMapping("/listRegistration")
    public Result listRegistration() {
        List<RegistrationInfo> ua = registrationInfoService.listRegistration();
        for (RegistrationInfo registrationInfo : ua) {
            System.out.println(registrationInfo);
        }
        return new Result(ResultCode.SUCCESS, ua);

    }


    @ApiOperation(value = "",notes = "通过病人姓名进行查找")
    @GetMapping("/getListRegistrationByPatientName")
    public @ResponseBody Result  getListRegistrationByPatientName(String patientName ){
        List<RegistrationInfo> list = registrationInfoService.getListRegistrationByPatientName(patientName);
        return new Result(ResultCode.SUCCESS, list);
    }


    @ApiOperation(value = "",notes = "通过传入的挂号表的id,修改State为2（无效），IsSeenDocator为1（未看诊）")
    @PutMapping(value = "/putRegistrationInfoUseState")
    public Result putRegistrationInfoUseState(@RequestBody String id){
        registrationInfoService.putRegistrationInfoUseState(Integer.parseInt (id));
        return  new Result(ResultCode.SUCCESS);
    }


    
}