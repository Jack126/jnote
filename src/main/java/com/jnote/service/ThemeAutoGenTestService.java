package com.jnote.service;

/**
 * @author jack126 https://github.com/Jack126
 * @classname ThemeAutoGenTestService
 * @description TODO
 * @date 2019/3/29 13:37
 */

import com.jnote.model.Theme;

public interface ThemeAutoGenTestService {

    int insertSelective(Theme record);

    Theme selectByPrimaryKey(Integer id);
}