package com.study.demo03Lambda;

public class RunableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程执行了first");
    }
}
