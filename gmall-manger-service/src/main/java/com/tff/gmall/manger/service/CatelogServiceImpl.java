package com.tff.gmall.manger.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.tff.gmall.beans.PmsBaseCatalog1;
import com.tff.gmall.beans.PmsBaseCatalog2;
import com.tff.gmall.beans.PmsBaseCatalog3;
import com.tff.gmall.manger.mapper.PmsBaseCatelog1Mapper;
import com.tff.gmall.manger.mapper.PmsBaseCatelog2Mapper;
import com.tff.gmall.manger.mapper.PmsBaseCatelog3Mapper;
import com.tff.gmall.service.CatelogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CatelogServiceImpl implements CatelogService {

    @Autowired
    PmsBaseCatelog1Mapper catelog1Mapper;

    @Autowired
    PmsBaseCatelog2Mapper catelog2Mapper;

    @Autowired
    PmsBaseCatelog3Mapper catelog3Mapper;


    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        System.out.println(catelog1Mapper.selectAll().size());
        return catelog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        PmsBaseCatalog2 pmsBaseCatalog2 = new PmsBaseCatalog2();
        pmsBaseCatalog2.setCatalog1Id(catalog1Id);
        return catelog2Mapper.select(pmsBaseCatalog2);
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {

        PmsBaseCatalog3 pmsBaseCatalog3 = new PmsBaseCatalog3();
        pmsBaseCatalog3.setCatalog2Id(catalog2Id);
        return catelog3Mapper.select(pmsBaseCatalog3);
    }
}
