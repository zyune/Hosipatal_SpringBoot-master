package com.hospital.service.od;

import com.hospital.model.Drugs;
import com.hospital.model.HerbalApplication;
import com.hospital.model.HerbalItem;
import com.hospital.model.od.*;

import java.util.List;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName Od_HerbalServer
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/25 22:08
 * @Version 1.0
 **/

public interface Od_HerbalServer {


        void postHerbalApplication(HerbalApplication check, List<HerbalItem> fenditemList);

        List<HerbalItem> getHerbalFemdItem();

        List<HerbalAppliacationSUm> getHerbalApplicationByblh(String blh, String type);

        List<Drugs> getHerbalDrugsByName(String name, String type);
        List<Drugs> getMedicineDrugsByName(String name, String type);

        void putHerbalApplicationUseStateToOk(String id);

        void postNewHerbalApplication(HerbalApplication checkApplication);

        int postNewHerbalItem(HerbalItem checkItem, Integer checkApplicationID);

        void putHerbalApplicationUseStateToDelete(String id);


        void deleteHerbalItemByHerbalApplicationID(String checkID, String itemID);

        void sureAlertAppliction(HerbalApplication herbalAppliacation);

        List<Drugs> putHerbalApplicationUseStateToSave(HerbalAppliacationSUm herbalAppliacationSUm);


    //需要对于以下的每一个方法名进行注释

    }


