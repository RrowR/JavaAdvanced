package com.study.demo02Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * java.util
 * Class LinkedHashSet<E>
 *  java.lang.Object
 *      java.util.AbstractCollection<E>
 *          java.util.AbstractSet<E>
 *              java.util.HashSet<E>
 *                  java.util.LinkedHashSet<E>
 *  public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, Serializable
 *  LinkedHashSet集合特点：
 *      底层是一个哈希表：(数据+链表/红黑树)+链表：多了一条链表(记录元素的存储顺序)，保证元素有序
 */
public class Demo03LinkedHashSet {
    public static void main(String[] args) {
        /**
         * HashSet是一个无序并且不能重复的集合
         */
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("bbb");
        hashSet.add("ccc");
        hashSet.add("aaa");
        System.out.println(hashSet);
        /**
         * LinkedHashSet集合是一个有序的不能重复的集合
         */
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("bbb");
        linkedHashSet.add("ccc");
        linkedHashSet.add("aaa");
        System.out.println(linkedHashSet);
    }
}
