package com.jnote.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jnote.utils.RespUtil;
/**
 * @author Jack126 https://github.com/Jack126
 * @description 公用方法入口
 * @date 15:17 2019/4/3
*/
@RestController

public class PubController {
	//登陆失败
	@RequestMapping("/login_error")
	public RespUtil loginError() {
		return new RespUtil(400,"登陆失败");
	}
	//登陆成功
	@RequestMapping("/login_success")
	public RespUtil loginSuccess() {
		return new RespUtil(200,"登陆成功");
	}
	//退出
	@RequestMapping("/logout")
	public RespUtil logout() {
		return new RespUtil(200,"退出成功");
	}
	//登陆
	@RequestMapping("/login_page")
	public RespUtil loginPage() {
		return new RespUtil(400,"尚未登陆，请登陆后重试");
	}
}
