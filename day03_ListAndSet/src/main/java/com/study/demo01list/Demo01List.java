package com.study.demo01list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * java.util  包下
 * Interface List<E>
 * public interface List<E> extends Collection<E>
 *     1.存储的数据是连续的
 *     2.list集合是有索引的
 *     3.允许存在重复元素
 *  List接口中的特有方法：
 *      void add(int index, E element) 将指定的元素插入此列表中的指定位置（可选操作）
 *      E get(int index) 返回此列表中指定位置的元素
 *      E remove(int index) 删除该列表中指定位置的元素（可选操作），返回被移除的元素
 *      E set(int index, E element) 用指定的元素（可选操作）替换此列表中指定位置的元素
 *   注意:
 *      IndexOutOfBoundsException:索引越界异常,集合会报
 *      ArrayIndexOutOfBoundsException:数组索引越界异常
 *      StringIndexOutOfBoundsException:字符串索引越界异常
 */
public class Demo01List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);       //[a, b, c, d, a] 说明重写了toString方法

        list.add(3,"testElements");
        System.out.println(list);

        String elements = list.remove(2);   //返回被移除的元素
        System.out.println(elements);
        System.out.println(list);

        String b2 = list.set(1, "b2");      //返回被替换的元素
        System.out.println(b2);
        System.out.println(list);

        System.out.println(list.get(3));    //返回指定索引的元素
        for (int i = 0;i < list.size();i++){
            String result = list.get(i);
            System.out.print(result+" ");
        }
        System.out.println();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        //使用增强for
        for (String s : list) {
            System.out.print(s+" ");
        }
    }
}
