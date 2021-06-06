package com.study.Demo05;

import java.util.Arrays;

public class SystemAndStringBuilderSummary {
    public static void main(String[] args) {
//        demo01();
//        demo02();
//        demo03();
//        demo04();
        demo05();
    }

    private static void demo05() {
        //toString()将StringBuilder对象转换成一个字符串对象
        StringBuilder stringBuilder = new StringBuilder();
        String s = stringBuilder.append(12323).append(true).append("hello").append(2.3).reverse().toString();
        System.out.println(s);
    }

    private static void demo04() {
        //将StringBuilder里的数据进行反转
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder append = stringBuilder.append(1).append(2).append(3).append(4).append(5);
        System.out.println(append.reverse());
    }

    private static void demo03() {
        //StringBuilder的append方法
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder append = stringBuilder.append(1).append(2).append(3).append(4).append(5);
        System.out.println(append);
    }

    private static void demo02() {
        //System类里的arraycopy方法，将当前数组中的指定字符个数替换到目标数组的位置中去
        String[] arr1 = {"a","b","c","d","e","f","g"};
        String[] arr2 = {"h","i","j","k","l","m","n"};
        System.arraycopy(arr1,1,arr2,3,2);
        System.out.println(Arrays.toString(arr2));
    }

    private static void demo01() {
        //获取当前系统时间,可以当作时间戳，也可以进行时间相减计算程序运行时间
        long time = System.currentTimeMillis();
        System.out.println(time);
    }
}
