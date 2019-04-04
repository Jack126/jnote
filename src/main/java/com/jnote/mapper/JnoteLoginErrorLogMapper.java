package com.jnote.mapper;

import com.jnote.model.JnoteLoginErrorLog;

public interface JnoteLoginErrorLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JnoteLoginErrorLog record);

    int insertSelective(JnoteLoginErrorLog record);

    JnoteLoginErrorLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteLoginErrorLog record);

    int updateByPrimaryKey(JnoteLoginErrorLog record);
}