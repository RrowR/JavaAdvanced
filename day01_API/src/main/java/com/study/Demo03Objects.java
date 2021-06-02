package com.study;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = "111";
        String s2 = "222";
        String s3 = "111";
        //由于字符串也是一个对象，允许为空
        String s4 = null;
        //这里的字符串对象是默认重写了equals方法，所以比较的是值
        boolean b = s1.equals(s2);
        boolean b1 = s1.equals(s3);
        /*  String 类的equals方法源码
            public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof String) {
            String anotherString = (String)anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;           //如果传入的对象不是一个String类型，那么直接返回false
    }
         */
        boolean b2 = s1.equals(s4);         //安装正常来说这里会报错，因为传入的s4是一个空，不能调用方法，但是在我的jdk1.8中，这里的方法是允许存在空指针的
        //当然还有另一种方法
        boolean b3 = Objects.equals(s1, s4);
        System.out.println(b3);
/*
    public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));      //这里就判断了是否为空，直接会返回false
    }
 */

//        s1.equals()
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
    }
}
