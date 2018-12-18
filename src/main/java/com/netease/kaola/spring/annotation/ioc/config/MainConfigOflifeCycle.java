package com.netease.kaola.spring.annotation.ioc.config;

import com.netease.kaola.spring.annotation.ioc.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.netease.kaola.spring.annotation.ioc.bean")
public class MainConfigOflifeCycle {

    @Bean(initMethod = "init",destroyMethod = "detory")
    public Car car() {
        return new Car();
    }
}
