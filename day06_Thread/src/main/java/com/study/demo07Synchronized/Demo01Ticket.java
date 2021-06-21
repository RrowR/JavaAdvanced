package com.study.demo07Synchronized;

public class Demo01Ticket implements Runnable{
    //设置票的总数
    private static int ticket = 100;
    @Override
    public void run() {
        System.out.println(this);   //这里的this指代的是Demo01Ticket这个对象
        //这里必须要进行循环，不循环程序就只会执行一次
        while (ticket > 0){
//            payTicket();
            payTicket2();
        }
    }
    //在方法上添加锁(同步方法)
    /*synchronized*/ void payTicket(){  //同步方法的锁对象就是默认的线程的实现类对象this
        //这个synchronized存在的意义就是当第一条线程进来时，会判断是否存在锁对象，下一条线程进来时，没有锁对象的线程将无法进来，只能等锁对象释放，获取锁对象才能执行
        synchronized (this){
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "出售第" + ticket + "张票");
                ticket--;
            }
        }
    }

    //使用静态同步的方法来添加锁
    static /*synchronized*/ void payTicket2(){
        synchronized (Demo01Ticket.class){
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "出售第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
