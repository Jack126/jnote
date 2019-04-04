package com.jnote.mapper;

import com.jnote.model.JnoteBlog;

public interface JnoteBlogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JnoteBlog record);

    int insertSelective(JnoteBlog record);

    JnoteBlog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteBlog record);

    int updateByPrimaryKey(JnoteBlog record);
}