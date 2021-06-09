package com.study.demo01list;

import java.util.LinkedList;

/**
 * public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
 * 链表结构：
 *     1.查询快增删慢
 *     2.里面包含了大量首尾元素的方法
 *     注意：使用LinkedList集合特有的方法，不能使用多态
 */
public class Demo02LinkedList {
    public static void main(String[] args) {
//        demo01();
//        demo02();
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        String first = list.removeFirst();
        String last = list.removeLast();
        System.out.println("first: "+first+" last: "+last);
    }

    private static void demo02() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.clear();           //清空list里的所有元素
        if (!list.isEmpty()){       //判断集合里是否为空，如果不为空则执行
            String first = list.getFirst();     //获取元素中的第一个元素
            String last = list.getLast();       //获取元素中的最后一个元素
            System.out.println("first: "+first+" last: "+last);
        }
    }

    /**
     * 添加起始末尾元素和push以及pop
     */
    private static void demo01() {
        //创建LinkedList对象
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        list.addFirst("first");     //添加到开头
        list.addLast("Last");       //添加到末尾
        System.out.println(list);

        list.push("PushedElements");        //推入一个字符串到索引0的位置，等效于addFirst(String s);
        System.out.println(list);
        String popedElements = list.pop();      //弹出索引0的元素,相当于E removeFirst(String s)
        System.out.println(popedElements);
        System.out.println(list);
    }
}
