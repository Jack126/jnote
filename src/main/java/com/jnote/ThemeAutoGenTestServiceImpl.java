package com.jnote;

import com.jnote.dao.ThemeMapper;
import com.jnote.model.Theme;
import com.jnote.service.ThemeAutoGenTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "themeAutoGenTestService")
public class ThemeAutoGenTestServiceImpl implements ThemeAutoGenTestService {

    @Autowired
    ThemeMapper dao;


    @Override
    public int insertSelective(Theme record) {
        return dao.insertSelective(record);
    }

    @Override
    public Theme selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }
}