package com.netease.kaola.spring.annotation.aop.config;

import com.netease.kaola.spring.annotation.aop.LogAspects;
import com.netease.kaola.spring.annotation.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 定义一个业务逻辑类：MathCalculator，
 * 1、方法运行之前打印日志，运行之后也打印日志或者捕获异常
 * 2、定义一个LogAspect感知业务逻辑运行情况：
 *     通知方法：
 *       前置通知
 *       后置通知
 *       返回通知
 *       异常通知
 *       环绕通知
 *  3、给切面类的方法加上通知注解
 *  4、把切面类和业务类都放到IOC里面
 *  5、告诉sping哪一个类是切面类，加上@Aspect
 *  6、<aop:..></>,给配置里面加一个注解EnableAspectJAutoProxy
 * */
@EnableAspectJAutoProxy
@Configuration
public class MainConfigOfAop {

    @Bean
    public MathCalculator mathCalculator() {
        return new MathCalculator();
    }
    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }
}
