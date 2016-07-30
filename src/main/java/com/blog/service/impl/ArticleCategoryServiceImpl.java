package com.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blog.dao.AbstractDao;
import com.blog.dao.ArticleCategoryDao;
import com.blog.model.ArticleCategory;
import com.blog.service.ArticleCategoryService;

@Service("articleCategoryService")
public class ArticleCategoryServiceImpl extends AbstractServiceImpl<ArticleCategory> implements ArticleCategoryService {
	@Autowired
	private ArticleCategoryDao articleCategoryDao;

	@Override
	public AbstractDao<ArticleCategory> getAbstractDao() {
		return articleCategoryDao;
	}

}
