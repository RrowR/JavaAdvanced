package com.study.demo06TicketSell;

public class Demo01Ticket implements Runnable{
    //设置票的总数
    private int ticket = 100;
    //创建一个锁对象,这个对象一定不能创建在run里面，否则线程在调用的时候会创建3个对象
    Object obj = new Object();

    @Override
    public void run() {
        //这里必须要进行循环，不循环程序就只会执行一次
        while (ticket > 0){
            //这个synchronized存在的意义就是当第一条线程进来时，会判断是否存在锁对象，下一条线程进来时，没有锁对象的线程将无法进来，只能等锁对象释放，获取锁对象才能执行
            synchronized (obj) {
                if (ticket > 0) {
                    /**
                     * 此代码的目的是为了提高代码出现问题的几率
                     */
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "出售第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
