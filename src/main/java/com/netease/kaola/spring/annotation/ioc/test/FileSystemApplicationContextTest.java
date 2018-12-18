package com.netease.kaola.spring.annotation.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Date;

public class FileSystemApplicationContextTest {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\study\\spring-code-study\\src\\main\\resources\\spring.xml");
        Date bean = applicationContext.getBean(Date.class);
        System.out.println(bean);
    }
}
