package com.study.demo03Generic;

public class Demo04InterfaceGenericImpl implements Demo04InterfaceGeneric<String/*如果是String重写方法时也是String*/>{
    @Override
    public void Method(String s) {
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        Demo04InterfaceGeneric d4 = new Demo04InterfaceGenericImpl();
        d4.Method("haha");

    }

}
