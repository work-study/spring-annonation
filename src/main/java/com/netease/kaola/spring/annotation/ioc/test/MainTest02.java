package com.netease.kaola.spring.annotation.ioc.test;

import com.netease.kaola.spring.annotation.ioc.bean.Person;
import com.netease.kaola.spring.annotation.ioc.config.MainConfig02;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class MainTest02 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig02.class);
        System.out.println("start..........");
        /**
         * 1、懒加载和单例多例
         * */
        Person person = applicationContext.getBean("person", Person.class);
        Person person1 = applicationContext.getBean("person", Person.class);
        System.out.println(person==person1);

        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String name : beanNamesForType) {
            System.out.println(name);
        }

        Environment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println("操作系统的名字："+property);
    }
}
