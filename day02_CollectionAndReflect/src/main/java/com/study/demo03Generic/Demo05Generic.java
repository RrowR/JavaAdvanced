package com.study.demo03Generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型的通配符,只能用在参数的传递上，不能用在参数的定义上
 */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("mm");
        strings.add("jh");
/*
        这里在定义的时候就使用？就会报错
        ArrayList<?> strings = new ArrayList<>();
        strings.add("mm");
        strings.add("jh");*/
        testArray(integers);
        testArray(strings);
    }

    /**
     * 当传入的集合我们不知道传入什么类型的时候，我们可以使用 ? 通配符作为这个集合的泛型，这时里面就需要使用迭代器才行，此时我们传入的集合就可以是任意类型了
     * @param list
     */
    public static void testArray(ArrayList<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}