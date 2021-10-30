package com.hospital.model.od;

import com.hospital.model.DepartmentExample;
import com.hospital.model.Diagnosi;
import com.hospital.model.MedicalRecordPage;

/**
 * 2019年东软睿道实训项目-东软云医院项目
 *
 * @ClassName AcceptMRPandList
 * @Description 请输入你的简化描述！
 * @Author 方聪
 * @Date 2019/6/30 18:00
 * @Version 1.0
 **/

public class AcceptMRPandList {
    MedicalRecordPage mrp;
    Diagnosi[] diagnosis;

    public MedicalRecordPage getMrp() {
        return mrp;
    }

    public void setMrp(MedicalRecordPage mrp) {
        this.mrp = mrp;
    }

    public Diagnosi[] getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosi[] diagnosis) {
        this.diagnosis = diagnosis;
    }
}
