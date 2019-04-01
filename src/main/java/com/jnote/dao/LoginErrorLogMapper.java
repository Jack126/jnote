package com.jnote.dao;

import com.jnote.model.LoginErrorLog;

public interface LoginErrorLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoginErrorLog record);

    int insertSelective(LoginErrorLog record);

    LoginErrorLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoginErrorLog record);

    int updateByPrimaryKey(LoginErrorLog record);
}