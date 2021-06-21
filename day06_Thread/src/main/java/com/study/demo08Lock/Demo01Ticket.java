package com.study.demo08Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * java.lang.Object
 *  java.util.concurrent.locks.ReentrantLock
 *      lock() 和 unlock() 给会出现多线程问题的代码段加锁
 */
public class Demo01Ticket implements Runnable{
    //设置票的总数
    private static int ticket = 100;
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (ticket > 0) {
            try {
            l.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "出售第" + ticket + "张票");
                    ticket--;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                l.unlock();
            }
        }
    }
}
