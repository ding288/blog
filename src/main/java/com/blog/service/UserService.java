package com.blog.service;

import com.blog.model.User;

public interface UserService extends AbstractService<User> {
	public User findUserByUserName(String userName);
}
