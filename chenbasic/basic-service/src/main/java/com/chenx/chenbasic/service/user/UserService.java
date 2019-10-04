package com.chenx.chenbasic.service.user;

import com.chenx.chenbasic.pojo.user.User;
import com.github.pagehelper.PageInfo;

/**
 * 用户管理
 * @author KuhYygy
 *
 */
public interface UserService {
	
	PageInfo<User> getAllUser();

}
