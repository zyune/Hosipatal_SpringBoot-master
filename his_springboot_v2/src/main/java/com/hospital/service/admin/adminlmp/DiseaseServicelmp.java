package com.hospital.service.admin.adminlmp;

import com.hospital.mapper.DiseaseMapper;
import com.hospital.model.Disease;
import com.hospital.model.DiseaseExample;
import com.hospital.service.admin.DiseaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * @Author 邵婷
 * @Date 2019/6/22 10:18
 * @Version 1.0*/
@Service
public class DiseaseServicelmp implements DiseaseService {
    @Resource
    DiseaseMapper diseaseMapper;
    DiseaseExample diseaseExample = new DiseaseExample();
    DiseaseExample.Criteria criteria = diseaseExample.createCriteria();

    @Override
    public List<Disease> findAll(){
        return diseaseMapper.selectByExample(diseaseExample);
    }

}
