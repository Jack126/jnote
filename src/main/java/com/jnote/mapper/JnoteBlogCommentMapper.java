package com.jnote.mapper;

import com.jnote.model.JnoteBlogComment;

public interface JnoteBlogCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JnoteBlogComment record);

    int insertSelective(JnoteBlogComment record);

    JnoteBlogComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteBlogComment record);

    int updateByPrimaryKeyWithBLOBs(JnoteBlogComment record);

    int updateByPrimaryKey(JnoteBlogComment record);
}