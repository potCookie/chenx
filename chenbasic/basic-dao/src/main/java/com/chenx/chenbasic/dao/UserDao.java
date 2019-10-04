package com.chenx.chenbasic.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.chenx.chenbasic.pojo.user.User;

@Mapper
public interface UserDao {

	List<User> getAllUser();

}
