package com.study.demo05Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * java.lang.Object
 *  java.util.Collections
 *      此类仅由静态方法组合或返回集合。 它包含对集合进行操作的多态算法
 *      static <T extends Comparable<? super T>> void sort(List<T> list) 根据其元素的natural ordering对指定的列表进行排序。
 */
public class Demo02Sort {
    public static void main(String[] args) {
//        demo01IntegerSort();
//        demo02StringSort();
        ArrayList<Person> list = new ArrayList<>();
        Person mm = new Person("mm", 9);
        Person jh = new Person("jh", 9);
        Person myn = new Person("myn", 14);
        Collections.addAll(list,mm,jh,myn);     //[Person{name='mm', age=9}, Person{name='jh', age=9}, Person{name='myn', age=14}]
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    /**
     * 本质是因为String实现了Comparable接口里的compareTo方法
     */
    private static void demo02StringSort() {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"3","1","5","4","2");
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    /**
     * 本质是因为String实现了Comparable接口里的compareTo方法
     */
    private static void demo01IntegerSort() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,3,1,5,4,2);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
