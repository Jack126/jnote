package com.jnote.dao;

import com.jnote.model.ProductDoc;

public interface ProductDocMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductDoc record);

    int insertSelective(ProductDoc record);

    ProductDoc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductDoc record);

    int updateByPrimaryKey(ProductDoc record);
}