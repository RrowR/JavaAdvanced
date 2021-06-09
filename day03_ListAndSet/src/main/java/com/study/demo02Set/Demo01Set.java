package com.study.demo02Set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * public class HashSet<E>
 *   extends AbstractSet<E>
 *      implements Set<E>, Cloneable, Serializable
 *  特点：
 *       1.不能使用普通的for循环进行遍历
 *       2.没有索引
 *       3.不能使用重复的元素
 *       4.底层是一个Hash结构(查询速度非常快)
 */
public class Demo01Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);     //这里就不循序打印重复元素
        System.out.println(set);            //[1, 2, 3, 4]  说明set集合重写了toString方法

        //遍历set的集合可以使用iterator或者使用增强for循环来对set进行遍历
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        方法2，可以使用增强for循环，这个最方便
        for (Integer i : set) {
            System.out.println(i);
        }


    }
}
