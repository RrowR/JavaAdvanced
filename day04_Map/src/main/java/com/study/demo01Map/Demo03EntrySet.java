package com.study.demo01Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合中遍历的第二种方式：
 *  Set<Map.Entry<K,V>> entrySet()
 *  返回此地图中包含的映射的Set视图。
 *  K getKey()
 *  返回与此条目相对应的键。
 *  V getValue()
 *  返回与此条目相对应的值。
 */
public class Demo03EntrySet {
    public static void main(String[] args) {
        HashMap<String, String> maps = new HashMap<>();
        maps.put("猫羽雫","16");
        maps.put("mm","9");
        maps.put("jh","10");
        maps.put("naya","sound");
        //将key和value保存到一个entry对象中，再将这个entry对象保存到set集合中
        Set<Map.Entry<String, String>> entries = maps.entrySet();
        //遍历出set集合中的所有entry，然后使用get或者set方法来进行取值
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key="+key+" value="+value);
        }
        System.out.println("----------------使用迭代器-------------------");
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key="+key+" value="+value);
        }
    }
}
