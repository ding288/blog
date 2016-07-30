package com.blog.service;

import java.util.List;

import com.blog.model.Article;

public interface ArticleService extends AbstractService<Article> {
	public List<Article> findByUsername(String username, int pageNum, int pageSize);
}
