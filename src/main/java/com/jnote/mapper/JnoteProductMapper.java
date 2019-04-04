package com.jnote.mapper;

import com.jnote.model.JnoteProduct;

public interface JnoteProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JnoteProduct record);

    int insertSelective(JnoteProduct record);

    JnoteProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteProduct record);

    int updateByPrimaryKey(JnoteProduct record);
}