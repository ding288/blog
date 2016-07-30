package com.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blog.dao.AbstractDao;
import com.blog.dao.TagDao;
import com.blog.model.Tag;
import com.blog.service.TagService;

@Service("tagService")
public class TagServiceImpl extends AbstractServiceImpl<Tag> implements TagService {
	@Autowired
	private TagDao tagDao;

	@Override
	public AbstractDao<Tag> getAbstractDao() {
		return tagDao;
	}

}
