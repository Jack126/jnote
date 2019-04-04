package com.jnote.mapper;

import com.jnote.model.JnoteLogin;

public interface JnoteLoginMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JnoteLogin record);

    int insertSelective(JnoteLogin record);

    JnoteLogin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteLogin record);

    int updateByPrimaryKey(JnoteLogin record);
}