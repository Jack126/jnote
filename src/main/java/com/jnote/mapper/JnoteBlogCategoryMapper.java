package com.jnote.mapper;

import com.jnote.model.JnoteBlogCategory;

public interface JnoteBlogCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JnoteBlogCategory record);

    int insertSelective(JnoteBlogCategory record);

    JnoteBlogCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteBlogCategory record);

    int updateByPrimaryKey(JnoteBlogCategory record);
}