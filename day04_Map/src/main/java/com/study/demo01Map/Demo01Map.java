package com.study.demo01Map;

import java.util.HashMap;

/**
    java.util.Map<k,v>集合    不属于Collection集合里的
    Map集合的特点:
        1.Map集合是一个双列集合,一个元素包含两个值(一个key,一个value)
        2.Map集合中的元素,key和value的数据类型可以相同,也可以不同
        3.Map集合中的元素,key是不允许重复的,value是可以重复的
        4.Map集合中的元素,key和value是一一对应
    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点:
        1.HashMap集合底层是哈希表:查询的速度特别的快
            JDK1.8之前:数组+单向链表
            JDK1.8之后:数组+单向链表|红黑树(链表的长度超过8):提高查询的速度
        2.hashMap集合是一个无序的集合,存储元素和取出元素的顺序有可能不一致
   java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
   LinkedHashMap的特点:
        1.LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
        2.LinkedHashMap集合是一个有序的集合,存储元素和取出元素的顺序是一致的
 */
public class Demo01Map {
    public static void main(String[] args) {
//        demo01();
//        demo02();
//        demo03();
        demo04();
    }

    /**
     * boolean containsKey(Object key)
     * 如果此映射包含指定键的映射，则返回 true 。
     */
    private static void demo04() {
        HashMap<String, String> map = new HashMap<>();
        map.put("first","1");
        map.put("second","2");
        map.put("third","3");
        map.put("fourth","4");
        System.out.println(map.containsKey("first"));       //true
        System.out.println(map.containsKey("fifth"));       //false
    }

    /**
     * V get(Object key)返回到指定键所映射的值，或null如果此映射包含该键的映射。
     */
    private static void demo03() {
        HashMap<String, String> map = new HashMap<>();
        map.put("first","1");
        map.put("second","2");
        map.put("third","3");
        map.put("fourth","4");
        System.out.println(map);
        System.out.println(map.get("first"));       //返回1
        System.out.println(map.get("fifth"));       //返回null
    }

    /**
     * V remove(Object key)
     * 如果存在（从可选的操作），从该地图中删除一个键的映射。
     *  当remove <K,V>键值对的2种情况：
     *      1.当移除的K值不存在时，返回的V是null
     *      2.当移除的K值存在时，返回的值是被移除的值
     */
    private static void demo02() {
        HashMap<String, String> map = new HashMap<>();
        map.put("first","1");
        map.put("second","2");
        map.put("third","3");
        map.put("fourth","4");
        String fifth = map.remove("fifth");
        System.out.println(map);
        System.out.println(fifth);      //返回值为null
        String third = map.remove("third");
        System.out.println(third);      //返回值为"3"
        System.out.println(map);
        String fifth2 = map.remove("fifth");
        System.out.println(fifth2);

    }

    /**
     * V put(K key, V value)
     * 将指定的值与该映射中的指定键相关联（可选操作）
     *  当put <K,V>键值对的2种情况：
     *      1.当存储的K不重复时，返回的V为null
     *      2.当存储的K重复时，返回的V是被替换的值
     */
    private static void demo01() {
        HashMap<String, Integer> map = new HashMap<>();
        Integer first = map.put("first", 1);
        System.out.println(first);      // null
        Integer repalces = map.put("first", 2);
        System.out.println(repalces);     // 返回值是 1
        System.out.println(map);        //{first=2}     重写了toString方法
        map.put("second",3);
        map.put("third",4);
        map.put("fourth",5);
        System.out.println(map);        //{third=4, fourth=5, first=2, second=3}
    }
}
