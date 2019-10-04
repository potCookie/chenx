package com.chenx.chenbasic.console.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chenx.chenbasic.pojo.user.User;
import com.chenx.chenbasic.service.user.UserService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("getAllUser")
	public PageInfo<User> getAllUser() {
		return userService.getAllUser();
	}

}
