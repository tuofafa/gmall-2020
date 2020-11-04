package com.tff.gmall.service;

import com.tff.gmall.beans.PmsBaseAttrInfo;

import java.util.List;

public interface PmsBaseAttrInfoService {

    /**
     * 根据三级分类查询所有的平台属性名
     * @param catalog3Id
     * @return
     */
    List<PmsBaseAttrInfo> getAttrInfoList(String catalog3Id);
}
