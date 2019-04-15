package com.jnote.mapper;

import com.jnote.model.JnoteBlog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface JnoteBlogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JnoteBlog record);

    int insertSelective(JnoteBlog record);

    JnoteBlog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteBlog record);

    int updateByPrimaryKey(JnoteBlog record);
    
    JnoteBlog getBlogById(Integer id);
    
}