package com.study.demo05InnerClassThread;

/**
 * 使用匿名内部类里的方法来开启多线程
 */
public class Demo05InnerClassThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("aaaa"+i);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("bbbb"+i);
                }
            }
        }).start();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("cccc" + i);
                }
            }
        };
        new Thread(r).start();
    }
}
