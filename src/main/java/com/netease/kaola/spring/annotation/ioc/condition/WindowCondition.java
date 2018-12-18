package com.netease.kaola.spring.annotation.ioc.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

//判断是不是window
public class WindowCondition implements Condition {

    /**
     * context：上下文
     * metadata：注释信息
     * */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //获取IOC容器
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //类加载器
        ClassLoader classLoader = context.getClassLoader();
        //获取当前环境
        Environment environment = context.getEnvironment();
        //获取bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();

        return environment.getProperty("os.name").contains("Windows");
    }
}
