package com.study.demo02ThreadPool;

public class ThreadClassImpl extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程执行了");
    }
}
