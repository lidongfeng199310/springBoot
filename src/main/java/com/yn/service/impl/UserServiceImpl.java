package com.yn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yn.mapper.UserMapper;
import com.yn.model.User;
import com.yn.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
    private UserMapper userMapper;

    public List<User> getUserInfo(){
        return userMapper.findUserInfo();
    }

    //@Transactional开启事务
    @Transactional
	public void insert(User user) {
		userMapper.addUserInfo(user);
		userMapper.addUserInfo(user);
		
	}
}
