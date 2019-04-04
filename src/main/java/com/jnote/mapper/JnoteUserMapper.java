package com.jnote.mapper;

import com.jnote.model.JnoteUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JnoteUserMapper {
    JnoteUser loadUserByUserName(@Param("username") String username);

    int deleteByPrimaryKey(Integer id);

    int insert(JnoteUser record);

    int insertSelective(JnoteUser record);

    JnoteUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteUser record);

    int updateByPrimaryKey(JnoteUser record);
}