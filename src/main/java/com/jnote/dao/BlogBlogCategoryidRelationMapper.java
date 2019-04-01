package com.jnote.dao;

import com.jnote.model.BlogBlogCategoryidRelation;

public interface BlogBlogCategoryidRelationMapper {
    int insert(BlogBlogCategoryidRelation record);

    int insertSelective(BlogBlogCategoryidRelation record);
}