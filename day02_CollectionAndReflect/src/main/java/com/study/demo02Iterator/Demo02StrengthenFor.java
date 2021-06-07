package com.study.demo02Iterator;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 增强for循环      增强for循环可以遍历任何集合
 */
public class Demo02StrengthenFor {
    public static void main(String[] args) {
//        demo01();
//        demo02();
        demo03();
    }

    private static void demo03() {
        HashSet<String> list = new HashSet<>();
        list.add("镜华");
        list.add("美美");
        list.add("猫羽雫");
        list.add("猫羽雫");
        list.add("nya");
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("镜华");
        list.add("美美");
        list.add("猫羽雫");
        list.add("nya");
        for (String s : list) {
            System.out.println(s);
        }

    }

    private static void demo01() {
        int[] arr = {1,2,3,4,5};
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
