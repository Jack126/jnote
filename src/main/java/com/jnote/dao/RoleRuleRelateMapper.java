package com.jnote.dao;

import com.jnote.model.RoleRuleRelate;

public interface RoleRuleRelateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleRuleRelate record);

    int insertSelective(RoleRuleRelate record);

    RoleRuleRelate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleRuleRelate record);

    int updateByPrimaryKey(RoleRuleRelate record);
}