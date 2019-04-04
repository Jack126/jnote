package com.jnote.mapper;

import java.util.List;

import com.jnote.model.JnoteRole;

public interface JnoteRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JnoteRole record);

    int insertSelective(JnoteRole record);

    JnoteRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteRole record);

    int updateByPrimaryKey(JnoteRole record);
    
    List<JnoteRole> getRolesByUserid(Long userid);
}