package com.tff.gamll.manger.controllrt;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tff.gmall.beans.PmsBaseAttrInfo;
import com.tff.gmall.service.PmsBaseAttrInfoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin
public class AttrControllrt {

    @Reference
    PmsBaseAttrInfoService attrInfoService;

    @RequestMapping(value = "attrInfoList",method = RequestMethod.POST)
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = attrInfoService.getAttrInfoList(catalog3Id);
        return pmsBaseAttrInfos;
    }

}
