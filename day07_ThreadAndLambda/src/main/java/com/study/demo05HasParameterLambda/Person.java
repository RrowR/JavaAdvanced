package com.study.demo05HasParameterLambda;

import lombok.Data;

/**
 * lombok注解不能创建匿名对象，因为它不知道构造方法的参数前后顺序
 */
@Data
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
