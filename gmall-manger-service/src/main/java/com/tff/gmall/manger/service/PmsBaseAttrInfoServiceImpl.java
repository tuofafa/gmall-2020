package com.tff.gmall.manger.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.tff.gmall.beans.PmsBaseAttrInfo;
import com.tff.gmall.manger.mapper.PmsBaseAttrInfoMapper;
import com.tff.gmall.service.PmsBaseAttrInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class PmsBaseAttrInfoServiceImpl implements PmsBaseAttrInfoService {

    @Autowired
    PmsBaseAttrInfoMapper attrInfoMapper;

    @Override
    public List<PmsBaseAttrInfo> getAttrInfoList(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        return attrInfoMapper.select(pmsBaseAttrInfo);
    }
}
