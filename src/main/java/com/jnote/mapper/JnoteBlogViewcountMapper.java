package com.jnote.mapper;

import com.jnote.model.JnoteBlogViewcount;

public interface JnoteBlogViewcountMapper {
    int deleteByPrimaryKey(Integer blog_id);

    int insert(JnoteBlogViewcount record);

    int insertSelective(JnoteBlogViewcount record);

    JnoteBlogViewcount selectByPrimaryKey(Integer blog_id);

    int updateByPrimaryKeySelective(JnoteBlogViewcount record);

    int updateByPrimaryKey(JnoteBlogViewcount record);
}