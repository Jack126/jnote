package com.jnote.controller;

import com.jnote.model.Theme;
import com.jnote.service.ThemeAutoGenTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyBatisTestController {


    @Autowired
    private ThemeAutoGenTestService themeAutoGenTestService;//测试通过自动生成器生成代码的例子

    //-------通过代码自动生成器生成的数据库表对象相关类：
    //Theme 实体类
    //ThemeMapper接口  dao
    //ThemeMapper.xml xml映射dao操作数据库
    @ResponseBody
    @PostMapping("/addtheme")
    public int insertTheme(Theme theme) {
        return themeAutoGenTestService.insertSelective(theme);
    }

    @ResponseBody
    @GetMapping("/gettheme")
    public Theme getThemeById(int id) {
        return themeAutoGenTestService.selectByPrimaryKey(id);
    }

}