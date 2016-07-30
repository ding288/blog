package com.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blog.dao.AbstractDao;
import com.blog.dao.CommentDao;
import com.blog.model.Comment;
import com.blog.service.CommentService;

@Service("commentService")
public class CommentServiceImpl extends AbstractServiceImpl<Comment> implements CommentService {
	@Autowired
	private CommentDao commentDao;

	@Override
	public AbstractDao<Comment> getAbstractDao() {
		return commentDao;
	}

}
