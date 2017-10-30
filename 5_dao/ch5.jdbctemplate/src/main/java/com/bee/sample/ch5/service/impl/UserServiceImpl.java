package com.bee.sample.ch5.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bee.sample.ch5.dao.UserDao;
import com.bee.sample.ch5.entity.User;
import com.bee.sample.ch5.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired UserDao userDao;
	
	public User geUserById(Integer id) {
		Map map = userDao.findUserById2(id);
		return null;
	}
}
