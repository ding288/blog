package com.blog.dao.impl;

import org.springframework.stereotype.Repository;
import com.blog.dao.ArticleCategoryDao;
import com.blog.model.ArticleCategory;

@Repository("articleCategoryDao")
public class ArticleCategoryDaoImpl extends AbstractDaoImpl<ArticleCategory> implements ArticleCategoryDao {

	@Override
	public Class<ArticleCategory> getEntityClass() {
		return ArticleCategory.class;
	}

}
