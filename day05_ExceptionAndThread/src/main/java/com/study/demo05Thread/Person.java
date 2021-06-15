package com.study.demo05Thread;

public class Person {
    private String name;

    public void run(){
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + name);
        }
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}
