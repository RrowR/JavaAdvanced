package com.study.demo09WaitAndNotify;

/**
 *java.lang
 * Class Object 下的 void notify()
 * 唤醒正在等待对象监视器的单个线程。
 * void notifyAll()
 * 唤醒正在等待对象监视器的所有线程。
 * void wait(long timeout)
 * 导致当前线程等待，直到另一个线程调用 notify()方法或该对象的 notifyAll()方法，或者指定的时间已过。
 */
public class WaitAndNotify2 {
    public static void main(String[] args) {
        Object obj = new Object();
        //开启线程1，吃包子
        new Thread(){
            @Override
            public void run() {
                    System.out.println("告知老板需要包子的数量1");
                    synchronized (obj){
                        //唤醒线程
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子吃完了1");
                        System.out.println("==============================================");
                    }
            }
        }.start();
        //开启线程3，吃包子
        new Thread(){
            @Override
            public void run() {
                    System.out.println("告知老板需要包子的数量3");
                    synchronized (obj){
                        //唤醒线程
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子吃完了3");
                        System.out.println("==============================================");
                    }
            }
        }.start();
        //开启线程2，做包子
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        //老板需要花5秒来做包子，所以我们这里让线程先睡5s
                        Thread.sleep(5000);
                        System.out.println("正在准备包子，请稍等");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("告知线程13包子做好了");
//                        obj.notifyAll();        //同时唤醒所有线程
                        obj.notify();       //唤醒单个线程
                    }
                }
            }
        }.start();
    }
}
