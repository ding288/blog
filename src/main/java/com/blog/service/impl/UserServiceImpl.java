package com.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blog.dao.AbstractDao;
import com.blog.dao.UserDao;
import com.blog.model.User;
import com.blog.service.UserService;

@Service("userService")
public class UserServiceImpl extends AbstractServiceImpl<User> implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public AbstractDao<User> getAbstractDao() {
		return userDao;
	}

	@Override
	public User findUserByUserName(String userName) {
		return userDao.findSingleResultByOneParam("User.findUserByUserName", "userName", userName);
	}

}
