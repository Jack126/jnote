package com.jnote.dao;

import com.jnote.model.DepartmentModuleRelation;

public interface DepartmentModuleRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DepartmentModuleRelation record);

    int insertSelective(DepartmentModuleRelation record);

    DepartmentModuleRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DepartmentModuleRelation record);

    int updateByPrimaryKey(DepartmentModuleRelation record);
}