package com.netease.kaola.spring.annotation.ioc.test;

import com.netease.kaola.spring.annotation.ioc.bean.Yellow;
import com.netease.kaola.spring.annotation.ioc.config.MainConfigOfPropertyValues;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_LPropertiesValue {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
        MyUtils.printAllBean(applicationContext);
        Yellow bean = applicationContext.getBean(Yellow.class);
        System.out.println(bean);
    }
}
