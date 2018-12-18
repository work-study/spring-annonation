package com.netease.kaola.spring.annotation.ioc.test;

import com.netease.kaola.spring.annotation.ioc.bean.Person;
import com.netease.kaola.spring.annotation.ioc.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }
}
