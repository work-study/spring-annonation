package com.netease.kaola.spring.annotation.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public void insertUser() {
        userDao.insert();
        System.out.println("end");
    }
}
