package com.jnote.dao;

import com.jnote.model.BlogContent;

public interface BlogContentMapper {
    int deleteByPrimaryKey(Integer blog_id);

    int insert(BlogContent record);

    int insertSelective(BlogContent record);

    BlogContent selectByPrimaryKey(Integer blog_id);

    int updateByPrimaryKeySelective(BlogContent record);

    int updateByPrimaryKeyWithBLOBs(BlogContent record);
}