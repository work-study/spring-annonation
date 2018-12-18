package com.netease.kaola.spring.annotation.ioc.bean;


import org.springframework.beans.factory.FactoryBean;

//创建一个spring定义的工厂Bean
public class ColorFactoryBean implements FactoryBean<Color>{
    @Override
    public Color getObject() throws Exception {
        System.out.println("color factory bean");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    //是不是单列，true表示是单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
