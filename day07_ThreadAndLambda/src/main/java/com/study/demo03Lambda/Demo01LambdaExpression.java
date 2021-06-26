package com.study.demo03Lambda;

/**
 * lambda表达式的使用
 */
public class Demo01LambdaExpression {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程执行了third");
            }
        }).start();

        /*
        * Lambda表达式的使用：
        *       1. （） 代表Thread里的无参run方法
        *       2.  ->  代表要实现的方法体
        *       3.  {具体实现方法的内容}
        * */
        new Thread(() -> {System.out.println(Thread.currentThread().getName() + "线程执行了third");}).start();
        
    }
}
