package com.blog.dao.impl;

import org.springframework.stereotype.Repository;

import com.blog.dao.ArticleDao;
import com.blog.model.Article;

@Repository("articleDao")
public class ArticleDaoImpl extends AbstractDaoImpl<Article> implements ArticleDao{

	@Override
	public Class<Article> getEntityClass() {
		return Article.class;
	}

}
