package com.blog.dao.impl;

import org.springframework.stereotype.Repository;

import com.blog.dao.CommentDao;
import com.blog.model.Comment;

@Repository("commentDao")
public class CommentDaoImpl extends AbstractDaoImpl<Comment> implements CommentDao{

	@Override
	public Class<Comment> getEntityClass() {
		return Comment.class;
	}

}
