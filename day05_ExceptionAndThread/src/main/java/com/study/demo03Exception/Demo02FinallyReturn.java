package com.study.demo03Exception;

/**
 * 尽量不要在finally里写return代码，否则会永远return finally里的内容
 */
public class Demo02FinallyReturn {
    public static void main(String[] args) {
        System.out.println(getA());
    }

    private static int getA() {
        int a = 10;
        try {
            return a;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            a = 100;
            return a;
        }
    }
}
