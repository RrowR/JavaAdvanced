package com.study.demo03Generic;

/**
 *  引用了定义泛型的类
 */
public class Demo02Generic {
    public static void main(String[] args) {
//        method01();
        method02();
    }

    private static void method02() {
        Demo02GenericClass<String> dgc = new Demo02GenericClass<>();
        dgc.setName("镜华");
        System.out.println(dgc.getName());
        System.out.println(dgc.getName().length());
    }

    private static void method01() {
        Demo02GenericClass<Integer> dgc = new Demo02GenericClass<>();
        dgc.setName(12);
        System.out.println(dgc.getName());
    }
}
