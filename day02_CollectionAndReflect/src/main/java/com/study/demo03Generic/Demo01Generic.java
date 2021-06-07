package com.study.demo03Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
//        show01();
        demo02();
    }

    private static void demo02() {
        /**
         * 使用泛型的
         * 好处：
         *      1.避免了转换了麻烦
         *      2.把运行期的异常提升到了编译期
         * 弊端：
         *      1.规定什么类型就只能存储什么类型了
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
//        list.add(1);                //到这里就会开始报错
        Iterator<String> iterator = list.iterator();        //iterator类型也会有泛型
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next.length());
        }
    }

    private static void show01() {
        /**
         * 创建一个没有集合的泛型，所以不使用泛型容易产生异常
         */
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add(1);
        list.add(1.1);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            //想要使用String类，调用String类中的length方法
            Object next = iterator.next();
            String s = (String) next;       //将obj类型转换为String类型
            System.out.println(s.length());     //java.lang.Integer cannot be cast to java.lang.String      这里不能将Int类型转换成String类型
        }


    }
}
