package com.jnote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jnote.model.JnoteBlog;
import com.jnote.mapper.JnoteBlogMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class BlogService {
	protected static Logger logger = LoggerFactory.getLogger(BlogService.class);

	@Autowired
	JnoteBlogMapper jnoteblogMapper;
	
	public JnoteBlog getBlogById(Integer id) {
		JnoteBlog blog = jnoteblogMapper.getBlogById(id);
		return blog;
	}
}
