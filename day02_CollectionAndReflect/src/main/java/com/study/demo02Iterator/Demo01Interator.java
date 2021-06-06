package com.study.demo02Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * java.util    Interface Iterator<E>
 *     boolean hasNext() 如果迭代具有更多元素，则返回 true 。
 *     E next()  返回迭代中的下一个元素。
 *     Iterator<E> iterator() Collection中返回此集合中的元素的迭代器。
 *     迭代器的使用步骤(重点):
 *      1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
 *      2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
 *      3.使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class Demo01Interator {
    public static void main(String[] args) {
//        demo01();
//        demo02();
        demo03();
    }

    private static void demo03() {
        Collection<String> collection = new ArrayList<>();
        collection.add("镜华");
        collection.add("美美");
        collection.add("猫羽雫");
        collection.add("nya");
        Iterator<String> iterator = collection.iterator();
        //for循环的迭代器的使用
        for(String s;iterator.hasNext();){
            s = iterator.next();
            System.out.println(s);
        }
    }

    private static void demo02() {
        Collection<String> collection = new ArrayList<>();
        collection.add("镜华");
        collection.add("美美");
        collection.add("猫羽雫");
        collection.add("nya");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private static void demo01() {
        Collection<String> collection = new ArrayList<>();
        Collection<String> collection2 = new ArrayList<>();
        collection.add("镜华");
        collection.add("美美");
        collection.add("猫羽雫");
        collection.add("nya");
        //  接口                      返回实现类           多态思想
        Iterator<String> iterator = collection.iterator();
        if(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        if(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        if(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        if(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        if(iterator.hasNext()){
            System.out.println(iterator.next());
        }else {
            System.out.println("没有元素返回");
        }


        Iterator<String> iterator1 = collection2.iterator();
        if(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }else {
            System.out.println("没有内容返回");
        }
    }
}
