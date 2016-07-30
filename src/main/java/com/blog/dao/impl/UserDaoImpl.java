package com.blog.dao.impl;

import org.springframework.stereotype.Repository;

import com.blog.dao.UserDao;
import com.blog.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDaoImpl<User> implements UserDao{

	@Override
	public Class<User> getEntityClass() {
		return User.class;
	}

}
