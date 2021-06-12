package com.study.demo04JDK9;


import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * JDK9的新特性：
 *  static <E> List<E> of​(E... elements) 返回包含任意数量元素的不可变列表。
 *  使用前提：
 *      当集合中的元素已经确定的时候，不在改变时使用
 *  注意：
 *      1.of方法只适用于List接口，Set接口，Map接口，不适用接口的实现类
 *      2.of方法的返回值是一个不能改变的集合，集合不能再使用add、put等方法，会抛异常
 *      3.Set接口和Map接口在调用of方法的时候，不能有重复元素，否则会抛出异常
 */
public class demo01JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d", "e");
        System.out.println(list);
//        list.add("f");      //调用of方法添加的集合不能再进行添加，否则会报异常：java.lang.UnsupportedOperationException 不支持操作异常
//        Set<String> set = Set.of("a", "b", "a", "c", "d");      //不能存储重复元素：IllegalArgumentException 非法参数异常
        Set<String> set2 = Set.of("a", "b", "c", "d");
//        System.out.println(set);
//        set2.add("f");      //UnsupportedOperationException
        System.out.println(set2);
        Map<String, Integer> map = Map.of("张三", 18, "李四", 19, "王五", 20);
//        map.put("小卡",11);       //UnsupportedOperationException
        System.out.println(map);
//        Map<String, Integer> map2 = Map.of("张三", 18, "李四", 19, "王五", 20,"张三",21);       //IllegalArgumentException
//        System.out.println(map2);

    }
}
