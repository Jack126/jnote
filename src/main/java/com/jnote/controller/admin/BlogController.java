package com.jnote.controller.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.jnote.model.JnoteBlog;
import com.jnote.service.BlogService;


@RestController
@RequestMapping("/blog")
public class BlogController {
	protected static Logger logger = LoggerFactory.getLogger(BlogController.class);
	
	@Autowired
	BlogService blogService;
	
	@RequestMapping(value = "/{id}" , method = RequestMethod.GET)
	public JnoteBlog getBlogById(Long id) {
		return blogService.getBlogById(id);
	}
	
	@RequestMapping(value = "/list",method=RequestMethod.GET)
	public String list() {
		return "list";
	}
	
}
