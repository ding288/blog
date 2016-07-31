package com.blog.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.blog.model.Article;
import com.blog.service.ArticleService;

public class ArticleAction {
	private Article article;
	@Autowired
	private ArticleService articleService;

	public String write() {
		articleService.create(article);
		return "main";
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

}
