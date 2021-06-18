package com.study.demo02threadSetName;

public class ThreadSetNameDemo01 {
    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass();
        ThreadClass t2 = new ThreadClass("美美");
        t1.setName("镜华");
        t1.start();
        t2.start();
    }
}
