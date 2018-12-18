package com.netease.kaola.spring.annotation.ioc.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

}
