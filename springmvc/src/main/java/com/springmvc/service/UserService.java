package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.springmvc.model.User;   // ✅ com.springmvc

import com.springmvc.dao.*;
@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public int createUser(User user) {
        return this.userDao.saveUser(user);
    }
}