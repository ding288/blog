package com.blog.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.blog.model.User;
import com.blog.service.UserService;
import com.opensymphony.xwork2.ActionContext;

public class UserAction {

	private String username;
	private String password;
	@Autowired
	private UserService userService;

	public String login() {
		ActionContext ac = ActionContext.getContext();
		ac.put("username", username);
		User u = userService.findUserByUserName(username);
		if (u != null && u.getPassword().equals(password)) {
			ac.getSession().put("user", new User());
		}
		return "main";
	}

	public String logout() {
		ActionContext ac = ActionContext.getContext();
		ac.getSession().put("user", null);
		return "main";
	}

	public String regist() {
		return "login-success";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
