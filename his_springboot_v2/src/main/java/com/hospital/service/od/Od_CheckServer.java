package com.hospital.service.od;

import com.hospital.model.*;
import com.hospital.model.od.AcceptCheckTemplate;
import com.hospital.model.od.CheckAppliacationSUm;
import com.hospital.model.od.MRPListSum;

import java.util.List;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName Od_CheckServer
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/25 22:08
 * @Version 1.0
 **/

public interface Od_CheckServer {



        void postCheckApplication(CheckApplication check, List<CheckItem> fenditemList);

        List<FmedItem> getCheckFemdItem();

        List<CheckAppliacationSUm> getCheckApplicationByblh(String blh, String type);


        void putCheckApplicationUseStateToOk(String id);

        void postNewCheckApplication(CheckApplication checkApplication);

        int postNewCheckItem(CheckItem checkItem, Integer checkApplicationID);

        void putCheckApplicationUseStateToDelete(String id);

        MRPListSum getMRPandListbyMedicalRecord(String blh);

        void deleteCheckItemByCheckApplicationID(String checkID, String itemID);

        void postNewCheckTemplate(AcceptCheckTemplate acceptCheckTemplate);

        List<CheckStack> getCheckTemplateAllDeID(int doctorDePartMentID, String type);

        List<CheckStack> getCheckTemplateAll(String type);

        List<CheckStack> getCheckTemplateByDoctorID(int doctorID, String type);

        List<FmedItem> getFemdItemDataByFemdCodes(String codes);

        void sureAlertAppliction(String[] info);

        List<Object> getItemResult(String id);
        List<FmedItem> getCheckFemdItemByName(String name, String type);

        //需要对于以下的每一个方法名进行注释

    }


