package com.blog.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.blog.model.Article;
import com.blog.model.User;
import com.blog.service.ArticleService;
import com.blog.service.UserService;
import com.opensymphony.xwork2.ActionContext;

@Component
@Scope("prototype")
public class MainAction {
	private String username;
	@Autowired
	private UserService userService;
	@Autowired
	private ArticleService articleService;
	private Integer pageNum;
	private Integer pageSize;

	public String execute() {
		ActionContext ac = ActionContext.getContext();
		if (pageNum == null || pageNum < 1)
			pageNum = 1;
		if (pageSize == null || pageSize < 5)
			pageSize = 5;
		if (username == null || username.isEmpty()) {
			username = "demo";
		}
		User u = userService.findUserByUserName(username);
		ac.put("person", u.getPerson());
		List<Article> articles = articleService.findAll();
		ac.put("articles", articles);
		return "main";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
