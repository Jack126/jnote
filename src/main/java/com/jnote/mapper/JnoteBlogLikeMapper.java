package com.jnote.mapper;

import com.jnote.model.JnoteBlogLike;

public interface JnoteBlogLikeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JnoteBlogLike record);

    int insertSelective(JnoteBlogLike record);

    JnoteBlogLike selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteBlogLike record);

    int updateByPrimaryKey(JnoteBlogLike record);
}