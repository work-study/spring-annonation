package com.netease.kaola.spring.annotation.ioc.test;

import com.netease.kaola.spring.annotation.ioc.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        MyUtils.printAllBean(applicationContext);
        Object colorFactoryBean = applicationContext.getBean("colorFactoryBean");
        Object colorFactoryBean2 = applicationContext.getBean("&colorFactoryBean");
        System.out.println("bean1:"+colorFactoryBean.getClass());
        System.out.println("bean2:"+colorFactoryBean2.getClass());

    }
}
