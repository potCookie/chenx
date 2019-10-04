package com.chenx.chenbasic.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenx.chenbasic.dao.UserDao;
import com.chenx.chenbasic.pojo.user.User;
import com.chenx.chenbasic.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

}
