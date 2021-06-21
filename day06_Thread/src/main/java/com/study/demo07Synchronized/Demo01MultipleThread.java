package com.study.demo07Synchronized;

public class Demo01MultipleThread {
    public static void main(String[] args) {
        /**
         * 这里只能创建一个Runable的实现类，一共100张票
         */
        Runnable r = new Demo01Ticket();
        System.out.println(r);      //这里的this指代的是Demo01Ticket这个对象
        //这里开启多线程，这里是开启了3个多线程
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t1.start();
        t2.start();
        t3.start();
    }
}
