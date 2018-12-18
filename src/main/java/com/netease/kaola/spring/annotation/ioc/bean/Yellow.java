package com.netease.kaola.spring.annotation.ioc.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Data
@ToString
public class Yellow {
    @Value("123")
    private int id;

    @Value("#{20-1}")
    private int age;
    @Value("${yellow.name}")
    private String name;
}
