package com.jnote.dao;

import com.jnote.model.BlogViewcount;

public interface BlogViewcountMapper {
    int deleteByPrimaryKey(Integer blog_id);

    int insert(BlogViewcount record);

    int insertSelective(BlogViewcount record);

    BlogViewcount selectByPrimaryKey(Integer blog_id);

    int updateByPrimaryKeySelective(BlogViewcount record);

    int updateByPrimaryKey(BlogViewcount record);
}