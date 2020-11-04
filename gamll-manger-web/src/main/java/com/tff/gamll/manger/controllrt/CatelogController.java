package com.tff.gamll.manger.controllrt;


import com.alibaba.dubbo.config.annotation.Reference;
import com.tff.gmall.beans.PmsBaseCatalog1;
import com.tff.gmall.beans.PmsBaseCatalog2;
import com.tff.gmall.beans.PmsBaseCatalog3;
import com.tff.gmall.service.CatelogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class CatelogController {

    @Reference
    CatelogService catelogService;

    @RequestMapping(value = "/getCatalog1",method = RequestMethod.POST)
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> catalog1 = catelogService.getCatalog1();
        return catalog1;
    }

    @RequestMapping(value = "/getCatalog2",method = RequestMethod.POST)
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        List<PmsBaseCatalog2> catalog2 = catelogService.getCatalog2(catalog1Id);
        return catalog2;
    }

    @RequestMapping(value = "/getCatalog3",method = RequestMethod.POST)
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        List<PmsBaseCatalog3> catalog3 = catelogService.getCatalog3(catalog2Id);
        return catalog3;
    }


}
