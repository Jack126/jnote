package com.jnote.mapper;

import com.jnote.model.JnoteProductDoc;

public interface JnoteProductDocMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JnoteProductDoc record);

    int insertSelective(JnoteProductDoc record);

    JnoteProductDoc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteProductDoc record);

    int updateByPrimaryKey(JnoteProductDoc record);
}