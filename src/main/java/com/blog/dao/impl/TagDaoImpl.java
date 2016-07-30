package com.blog.dao.impl;

import org.springframework.stereotype.Repository;

import com.blog.dao.TagDao;
import com.blog.model.Tag;

@Repository("tagDao")
public class TagDaoImpl extends AbstractDaoImpl<Tag> implements TagDao{

	@Override
	public Class<Tag> getEntityClass() {
		return Tag.class;
	}

}
