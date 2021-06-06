package com.study.demo01Collection;

import java.util.*;

/**
 * java.util Interface Collection<E>
 *     所有单列集合的最顶层的接口，里面定义了所有单列集合共性的方法
 *     任意单列集合都可以使用Collection接口中的方法
 *  Collection是所有单列集合的父接口，因此在Collection中定义了单列集合(List和Set)通用的一些方法，这些方法可用于操作所有的单列集合。
 *  方法如下：       这里都是Collection里的顶层方法
 *      public boolean add(E e)`：  把给定的对象添加到当前集合中 。
 *      public void clear()` :清空集合中所有的元素。
 *      public boolean remove(E e)`: 把给定的对象在当前集合中删除。
 *      public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
 *      public boolean isEmpty()`: 判断当前集合是否为空。
 *      public int size()`: 返回集合中元素的个数。
 *      public Object[] toArray()`: 把集合中的元素，存储到数组中。
 */
public class CollectionDemo {
    public static void main(String[] args) {
//        demo01();
//        demo02();
//          demo03();
//        demo04();
//        demo05();
//        demo06();
//        demo07();
//        demo08();
        demo09();
    }

    private static void demo09() {
        Collection<String> collection = new HashSet<>();  //此时的Collection没有索引不能遍历
        collection.add("镜华");
        collection.add("镜华");
        collection.add("美美");
        collection.add("猫羽雫");
        System.out.println(collection);         // 如果使用多态创建set集合，那么这个集合里的元素不能重复
    }

    private static void demo08() {
        Collection<String> collection = new ArrayList<>();  //此时的Collection没有索引不能遍历
        collection.add("镜华");
        collection.add("美美");
        collection.add("猫羽雫");
        collection.add("nya");
        collection.clear();
        int size = collection.size();
        System.out.println(size);
        boolean empty = collection.isEmpty();
        System.out.println(empty);
    }

    private static void demo07() {
        Collection<String> collection = new ArrayList<>();  //此时的Collection没有索引不能遍历
        collection.add("镜华");
        collection.add("美美");
        collection.add("猫羽雫");
        collection.add("nya");
        Object[] array = collection.toArray();//将结合转换成数组，这样就可以进行遍历数组了
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void demo06() {
        Collection<String> collection = new ArrayList<>();
        collection.add("镜华");
        collection.add("美美");
        collection.add("猫羽雫");
        collection.add("nya");
        System.out.println(collection.size());          //collection中的size方法
    }

    private static void demo05() {
        Collection<String> collection = new ArrayList<>();
        Collection<String> collection2 = new ArrayList<>();
        collection.add("镜华");
        collection.add("美美");
        collection.add("猫羽雫");
        collection.add("nya");
        boolean empty = collection.isEmpty();
        System.out.println(empty);          //集合为不为空返回false
        boolean empty1 = collection2.isEmpty();
        System.out.println(empty1);         //集合为空返回true
    }

    private static void demo04() {
        Collection<String> collection = new ArrayList<>();
        collection.add("镜华");       //返回的是一个boolean值，没有返回的意义
        collection.add("美美");
        collection.add("猫羽雫");
        collection.add("nya");
        boolean b = collection.contains("美美");      //注意，collection方法中判断包含的不是索引位置而是对象
        System.out.println(b);
        boolean nya = collection.contains("nya");
        System.out.println(nya);
        boolean b1 = collection.contains("sdsada");
        System.out.println(b1);
    }

    private static void demo03() {
        Collection<String> collection = new ArrayList<>();
        collection.add("镜华");       //返回的是一个boolean值，没有返回的意义
        collection.add("美美");
        collection.add("猫羽雫");
        boolean b = collection.remove("镜华");        //注意，collection方法中移除的不是索引位置而是对象
        boolean b2 = collection.remove("其他");
        System.out.println(b);
        System.out.println(b2);
        System.out.println(collection);
    }

    private static void demo02() {
        Collection<String> collection = new ArrayList<>();
        collection.add("镜华");       //返回的是一个boolean值，没有返回的意义
        collection.add("美美");
        collection.add("猫羽雫");
        System.out.println(collection);     //结果不是地址值，说明内部重写了toString方法
    }

    private static void demo01() {
        ArrayList<Integer> list = new ArrayList<>();
        boolean b = list.add(1);
        System.out.println(b);
        if(list.isEmpty()){
            System.out.println(false);
        }else {
            System.out.println(true);
        }
        list.remove(0);
        list.add(2);
        boolean contains = list.contains(2);
        System.out.println(contains);
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));
        list.clear();
    }
}
