package com.jnote.mapper;

import com.jnote.model.JnoteDepartment;

public interface JnoteDepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JnoteDepartment record);

    int insertSelective(JnoteDepartment record);

    JnoteDepartment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteDepartment record);

    int updateByPrimaryKey(JnoteDepartment record);
}