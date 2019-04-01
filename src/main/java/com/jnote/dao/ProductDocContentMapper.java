package com.jnote.dao;

import com.jnote.model.ProductDocContent;

public interface ProductDocContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductDocContent record);

    int insertSelective(ProductDocContent record);

    ProductDocContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductDocContent record);

    int updateByPrimaryKeyWithBLOBs(ProductDocContent record);

    int updateByPrimaryKey(ProductDocContent record);
}