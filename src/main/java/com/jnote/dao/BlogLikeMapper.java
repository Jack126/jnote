package com.jnote.dao;

import com.jnote.model.BlogLike;

public interface BlogLikeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BlogLike record);

    int insertSelective(BlogLike record);

    BlogLike selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BlogLike record);

    int updateByPrimaryKey(BlogLike record);
}