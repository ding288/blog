package com.blog.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blog.dao.AbstractDao;
import com.blog.dao.ArticleDao;
import com.blog.model.Article;
import com.blog.service.ArticleService;

@Service("articleService")
public class ArticleServiceImpl extends AbstractServiceImpl<Article> implements ArticleService {
	@Autowired
	private ArticleDao articleDao;

	@Override
	public AbstractDao<Article> getAbstractDao() {
		return articleDao;
	}

	@Override
	public List<Article> findByUsername(String username, int pageNum, int pageSize) {
		HashMap<String,Object> params=new HashMap<String,Object>();
		params.put("userName", username);
		return articleDao.findByMap("Article.findByUsername", params, pageNum, pageSize);
	}

}
