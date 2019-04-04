package com.jnote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.jnote.utils.RespUtil;
/**
 * @author jack126 https://github.com/Jack126
 * @classname TestController
 * @description TODO
 * @date 2019/4/2 09:16
 */
@RestController
@RequestMapping
public class TestController {
    protected static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/home")
    public RespUtil index() {
        return new RespUtil(200,"ok123");
    }

    @RequestMapping(value = "/hello")
    public String hello() {
        return "security/hello";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "security/login";
    }
}
