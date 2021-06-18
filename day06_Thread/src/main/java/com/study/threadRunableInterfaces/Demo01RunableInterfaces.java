package com.study.threadRunableInterfaces;

/**
 * Runable本身没有start方法，需要讲接口的实现类传到Thread里才可以调用start方法
 *   使用这个方法将设置线程和开启线程进行了分离，实现了解耦合的效果，通过传入不同的Runable实现类到Thread中，实现了同一个Thread可以执行多个Run方法，里面的方法也可以各不相同
 * 直接继承Thread是达不到这种效果的
 *    使用多线程尽量使用Runable接口
 */
public class Demo01RunableInterfaces {
    public static void main(String[] args) {
        //创建Runable的实现类
        Runnable r1 = new RunableClassImpl();
        //将实现类传入到Thread类里面
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(new RunableClassImpl2());
        t1.start();
        t2.start();
        for (int i = 0; i < 20; i++) {
            System.out.println((Thread.currentThread() +" "+ i));
        }
    }
}
