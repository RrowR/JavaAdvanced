package com.study.demo01BaoziProject;

/**
 * 顾客：吃包子的人
 */
public class Customer extends Thread {
    private Baozi bz;

    public Customer(Baozi bz) {
        this.bz = bz;
    }

    /**
     * 这个线程实现顾客吃包子的方法
     */
    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                //如果有包子
                if (bz.flag == true) {
                    try {
                        System.out.println("顾客正在吃" + bz.getPi() + bz.getXian() + "的包子");
                        bz.wait(2000);
                        bz.flag = false;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (bz.flag == false) {
                    //唤醒线程让包子铺去做包子
                    bz.notify();
                }
            }
        }
    }
}
