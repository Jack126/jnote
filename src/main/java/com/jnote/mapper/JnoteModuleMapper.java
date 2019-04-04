package com.jnote.mapper;

import com.jnote.model.JnoteModule;

public interface JnoteModuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JnoteModule record);

    int insertSelective(JnoteModule record);

    JnoteModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteModule record);

    int updateByPrimaryKey(JnoteModule record);
}