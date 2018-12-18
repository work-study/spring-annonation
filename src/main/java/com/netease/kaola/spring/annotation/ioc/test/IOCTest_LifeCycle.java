package com.netease.kaola.spring.annotation.ioc.test;

import com.netease.kaola.spring.annotation.ioc.bean.Car;
import com.netease.kaola.spring.annotation.ioc.config.MainConfigOflifeCycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_LifeCycle {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOflifeCycle.class);
        Car bean = applicationContext.getBean(Car.class);
        applicationContext.close();
    }
}
