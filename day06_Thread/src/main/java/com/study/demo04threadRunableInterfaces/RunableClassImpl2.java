package com.study.demo04threadRunableInterfaces;

/**
 * 实现Runable接口的方式，重写接口里的run方法
 */
public class RunableClassImpl2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("helloworld"+i);
        }
    }
}
