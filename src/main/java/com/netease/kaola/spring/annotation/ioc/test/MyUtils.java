package com.netease.kaola.spring.annotation.ioc.test;

import org.springframework.context.ApplicationContext;

public class MyUtils {
    public static void printAllBean(ApplicationContext applicationContext) {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String s : beanDefinitionNames) {
            System.out.println(s);
        }
    }
}
