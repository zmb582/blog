package com.blog.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.dao.CommentDao;
import com.blog.entity.Comment;
import com.blog.service.CommentService;

@Service("commentService")
public class CommentServiceImpl implements CommentService{

	@Resource
	private CommentDao commentDao;
	
	@Override
	public int add(Comment comment) {
		return commentDao.add(comment);
	}

	@Override
	public int update(Comment comment) {
		return commentDao.update(comment);
	}

	@Override
	public List<Comment> list(Map<String, Object> map) {
		return commentDao.list(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return commentDao.getTotal(map);
	}

	@Override
	public Integer delete(Integer id) {
		return commentDao.delete(id);
	}

}