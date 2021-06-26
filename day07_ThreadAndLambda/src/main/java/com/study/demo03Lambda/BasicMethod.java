package com.study.demo03Lambda;

/**
 * 这里开始来引入lambda表达式：
 *      不管是在创建匿名Runable的时候还是在创建匿名Thread的时候，还是用正常的方法来开启线程的时候，我们都会去重新写一遍需要实现的方法，代码大量多余
 *      然而真正需要使用的代码却只有一条，此时可以来引入lambda表达式
 */
public class BasicMethod {
    public static void main(String[] args) {
        /*使用最基础的方法来开启线程*/
        RunableImpl r1 = new RunableImpl();
        new Thread(r1).start();
        /*使用匿名Thread来实现线程*/
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程执行了second");
            }
        };
        new Thread(r2).start();
        /*使用匿名Runable和匿名Thread来实现线程*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程执行了third");
            }
        }).start();
    }
}
