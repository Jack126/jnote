package com.jnote.mapper;

import com.jnote.model.JnoteDepartmentModuleRelation;

public interface JnoteDepartmentModuleRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JnoteDepartmentModuleRelation record);

    int insertSelective(JnoteDepartmentModuleRelation record);

    JnoteDepartmentModuleRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteDepartmentModuleRelation record);

    int updateByPrimaryKey(JnoteDepartmentModuleRelation record);
}