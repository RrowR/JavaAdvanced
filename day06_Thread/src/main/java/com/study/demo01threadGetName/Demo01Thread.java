package com.study.demo01threadGetName;

public class Demo01Thread {
    public static void main(String[] args) {
        ThreadClass t = new ThreadClass();
        ThreadClass t2 = new ThreadClass();
        t.start();
        t2.start();
        Thread thread = Thread.currentThread();
        System.out.println(thread);
    }
}
