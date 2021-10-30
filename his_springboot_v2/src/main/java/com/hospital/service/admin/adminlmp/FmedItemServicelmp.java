package com.hospital.service.admin.adminlmp;

import com.hospital.mapper.FmedItemMapper;
import com.hospital.model.FmedItem;
import com.hospital.model.FmedItemExample;
import com.hospital.service.admin.FmedItemService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/*
 * @Author 邵婷
 * @Date 2019/6/22 10:18
 * @Version 1.0*/

@Service
public class FmedItemServicelmp implements FmedItemService {
    @Resource
    FmedItemMapper fmedItemMapper;
    FmedItemExample fmedItemExample = new FmedItemExample();
    FmedItemExample.Criteria criteria = fmedItemExample.createCriteria();

    @Override
    public List<FmedItem> findAll(){
        return fmedItemMapper.selectByExample(fmedItemExample);
    }

    @Override
    public void addFmeditem(FmedItem fmedItem){
        fmedItemMapper.insert(fmedItem);
    }

    @Override
    public void updataFmeditem( FmedItem fmedItem){
        fmedItemMapper.updateByPrimaryKey(fmedItem);
    }

}
