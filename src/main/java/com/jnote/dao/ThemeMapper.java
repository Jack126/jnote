package com.jnote.dao;

import com.jnote.model.Theme;

public interface ThemeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Theme record);

    int insertSelective(Theme record);

    Theme selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Theme record);

    int updateByPrimaryKey(Theme record);
}