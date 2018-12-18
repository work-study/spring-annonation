package com.netease.kaola.spring.annotation.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void insert() {
        String sql = "INSERT INTO `user`(name,card,phone,zmf) VALUES(?,?,?,?)";
        jdbcTemplate.update(sql,"zw","32083011","1212121",725);
        int i =  10/0;
    }
}
