package com.jnote.mapper;

import com.jnote.model.JnoteJob;

public interface JnoteJobMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JnoteJob record);

    int insertSelective(JnoteJob record);

    JnoteJob selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteJob record);

    int updateByPrimaryKey(JnoteJob record);
}