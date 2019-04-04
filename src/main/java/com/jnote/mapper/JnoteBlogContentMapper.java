package com.jnote.mapper;

import com.jnote.model.JnoteBlogContent;

public interface JnoteBlogContentMapper {
    int deleteByPrimaryKey(Integer blog_id);

    int insert(JnoteBlogContent record);

    int insertSelective(JnoteBlogContent record);

    JnoteBlogContent selectByPrimaryKey(Integer blog_id);

    int updateByPrimaryKeySelective(JnoteBlogContent record);

    int updateByPrimaryKeyWithBLOBs(JnoteBlogContent record);
}