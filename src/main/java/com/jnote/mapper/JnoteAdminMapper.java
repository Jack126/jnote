package com.jnote.mapper;

import com.jnote.model.JnoteAdmin;

public interface JnoteAdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JnoteAdmin record);

    int insertSelective(JnoteAdmin record);

    JnoteAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteAdmin record);

    int updateByPrimaryKey(JnoteAdmin record);
}