package com.chenx.chenbasic.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenx.chenbasic.dao.UserDao;
import com.chenx.chenbasic.pojo.user.User;
import com.chenx.chenbasic.service.user.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public PageInfo<User> getAllUser() {
		PageHelper.startPage(2, 2);
		List<User> list = userDao.getAllUser();
		PageInfo<User> page = new PageInfo<User>(list);
		return page;
	}

}
