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

    public static void testArray(ArrayList<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}