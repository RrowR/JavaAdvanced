package com.study.demo03LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * java.util
 * Class LinkedHashMap<K,V>
 *     hash表+链表的结构 = 数组 + 链表 + 链表
 *     hash表：数组+链表
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        demo01();
        System.out.println("------LinkedHashMap-------");
        demo02();
    }

    /**
     * LinkedHashMap有序的
     */
    private static void demo02() {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("jh",10);
        linkedHashMap.put("mm",9);
        linkedHashMap.put("猫羽雫",16);
        System.out.println(linkedHashMap);
    }

    /**
     * HashMap是无序的
     */
    private static void demo01() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("jh",10);
        hashMap.put("mm",9);
        hashMap.put("猫羽雫",16);
        System.out.println(hashMap);
    }
}
