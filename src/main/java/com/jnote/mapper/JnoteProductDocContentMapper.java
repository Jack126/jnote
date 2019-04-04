package com.jnote.mapper;

import com.jnote.model.JnoteProductDocContent;

public interface JnoteProductDocContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JnoteProductDocContent record);

    int insertSelective(JnoteProductDocContent record);

    JnoteProductDocContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnoteProductDocContent record);

    int updateByPrimaryKeyWithBLOBs(JnoteProductDocContent record);

    int updateByPrimaryKey(JnoteProductDocContent record);
}