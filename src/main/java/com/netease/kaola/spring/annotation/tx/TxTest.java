package com.netease.kaola.spring.annotation.tx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TxTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.insertUser();
        applicationContext.close();
    }
}
