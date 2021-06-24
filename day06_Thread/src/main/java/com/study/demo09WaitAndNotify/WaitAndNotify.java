package com.study.demo09WaitAndNotify;

/**
 * 线程之间的通信
 * 总结：
 *     这里逻辑就是线程2一开始就会睡5秒，所以不管到底是谁先谁后，线程1一定是先执行的
 *     线程1开始执行，打印一句话告知，然后便进入到线程等待状态，这里是永久睡眠状态，只有通过锁对象来唤醒
 *     此时线程1已经终止，接下来会轮到线程2，线程2在睡眠5s之后执行包子已经做好了
 *     接下来注意：   调用同一个锁对象obj里的notify方法会使线程1被唤醒
 *     线程1在被唤醒之后会打印包子吃完了，一趟循环结束
 *     接下来线程2会继续等待，线程1会继续永久睡眠
 *
 *
 */
public class WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        //开启线程1，吃包子
        new Thread(){
            @Override
            public void run() {
               while (true){
                   System.out.println("告知老板需要包子的数量");
                   synchronized (obj){
                       //唤醒线程
                       try {
                           obj.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       try {
                           Thread.sleep(2000);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       System.out.println("包子吃完了");
                       System.out.println("==============================================");
                   }
               }
            }
        }.start();
        //开启线程2，做包子
        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        //老板需要花5秒来做包子，所以我们这里让线程先睡5s
                        Thread.sleep(5000);
                        System.out.println("正在准备包子，请稍等");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("告知线程1包子做好了");
                        obj.notify();       //这里的notify是为了唤醒已经wait了的线程，注意一定要使用同一个锁对象
                    }
                }
            }
        }.start();
    }
}
