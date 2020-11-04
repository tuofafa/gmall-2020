package com.tff.gmall.service;

import com.tff.gmall.beans.PmsBaseCatalog1;
import com.tff.gmall.beans.PmsBaseCatalog2;
import com.tff.gmall.beans.PmsBaseCatalog3;

import java.util.List;

public interface CatelogService {

    /**
     * 查询所有商品的一级目录
     * @return
     */
    List<PmsBaseCatalog1> getCatalog1();

    /**
     * 根据一级分类查询所有的二级分类
     * @return
     */
    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    /**
     * 根据二级分类查询二级分类下所有的分类
     * @param catalog2Id
     * @return
     */
    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
