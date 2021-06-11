package com.study.demo01Map;

import java.util.HashMap;
import java.util.Set;

/**
 * Set<K> keySet()
 * 返回此影射中包含的键的Set视图。
 */
public class Demo02KeySet {
    public static void main(String[] args) {
        HashMap<String, String> maps = new HashMap<>();
        maps.put("猫羽雫","16");
        maps.put("mm","9");
        maps.put("jh","10");
        maps.put("naya","sound");
        //返回这个映射中的所有key的set集合
//        Set<String> sets = maps.keySet();
        //遍历出set集合中的每一个key值
        for (String key : maps.keySet()) {
            //根据key值来找到对应的value值
            String value = maps.get(key);
            System.out.println("key="+key+" value="+value);
        }
    }
}
