package com.study.threadSleep;

/**
 * static void sleep(long millis) 这个方法本身是有异常的
 */
public class Demo01Sleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
//            注意这个sleep要写在for里面才可以
            Thread.sleep(1000);
        }
    }
}
