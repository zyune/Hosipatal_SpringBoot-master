package com.hospital.model.od;

import com.hospital.model.Diagnosi;
import com.hospital.model.MedicalRecordPage;

import java.util.List;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName MRPListSum
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/21 23:40
 * @Version 1.0
 **/

public class MRPListSum {
    MedicalRecordPage mrp;
    List<Diagnosi> diagnosiList;

    public MedicalRecordPage getMrp() {
        return mrp;
    }

    public void setMrp(MedicalRecordPage mrp) {
        this.mrp = mrp;
    }

    public List<Diagnosi> getDiagnosiList() {
        return diagnosiList;
    }

    public void setDiagnosiList(List<Diagnosi> diagnosiList) {
        this.diagnosiList = diagnosiList;
    }
}
