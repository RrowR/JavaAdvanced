package com.study.threadRunableInterfaces;

/**
 * 实现Runable接口的方式，重写接口里的run方法
 */
public class RunableClassImpl implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("这个是runable接口实现的方法"+i);
        }
    }
}
