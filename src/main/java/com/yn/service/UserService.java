package com.yn.service;

import java.util.List;

import com.yn.model.User;


public interface UserService {
    public List<User> getUserInfo();
    
    public void insert(User user);
}
