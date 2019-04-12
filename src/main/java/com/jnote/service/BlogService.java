package com.jnote.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.jnote.model.JnoteBlog;
import com.jnote.mapper.JnoteBlogMapper;

@service
public class BlogService {
	
	@Autowired
	JnoteBlogMapper jnoteblogMapper;
	
	public JnoteBlog getBlogById(Long id) {
		JnoteBlog blog = jnoteblogMapper.getBlogById(id);
		return blog;
	}

}
