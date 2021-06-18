package com.study.demo01threadGetName;

public class ThreadClass extends Thread{
    @Override
    public void run() {
        //获取线程名称的方式
//        String name = getName();
//        System.out.println(name);
        Thread thread = Thread.currentThread();
        System.out.println(thread);
    }
}
