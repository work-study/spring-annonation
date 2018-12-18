package com.netease.kaola.spring.annotation.ioc.test;

import com.netease.kaola.spring.annotation.ioc.config.MainConfigOfProfile;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Profile {
    public static void main(String[] args) {
        /*AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfProfile.class);
        MyUtils.printAllBean(applicationContext);*/
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("test","pro");
        applicationContext.register(MainConfigOfProfile.class);
        applicationContext.refresh();
        MyUtils.printAllBean(applicationContext);


    }
}
