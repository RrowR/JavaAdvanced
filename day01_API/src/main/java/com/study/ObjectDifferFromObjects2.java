package com.study;

import java.util.Objects;

public class ObjectDifferFromObjects2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "c";
        String s4 = null;
        boolean b = s1.equals(s2);
        System.out.println(b);

        boolean b1 = s1.equals(s3);
        System.out.println(b1);

        boolean b2 = s1.equals(s4);         //现在这里s4即使是null也不会报错了，因为源码这里添加了判断了
        System.out.println(b2);

        boolean b3 = Objects.equals(s1, s4);    //这里也不会出现错误，因为Object里面有代码判断是否为null，如果是null，则会直接返回false
        System.out.println(b3);

    }
}
