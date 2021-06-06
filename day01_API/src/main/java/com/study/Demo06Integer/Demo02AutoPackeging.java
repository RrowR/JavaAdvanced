package com.study.Demo06Integer;

import java.util.ArrayList;

/**
 * 在jdk1.5之后可以进行 自动 装箱和拆箱
 */
public class Demo02AutoPackeging {
    public static void main(String[] args) {
        Integer in  = 1;            //自动装箱，将基本数据类型1转换成Integer，内部则是Interger(1);
        Integer in2 = in + 3;       //先调用intValue方法将in进行自动拆箱再与3相加，最后得到的结果4再进行自动装箱
        System.out.println(in2);

        ArrayList<Integer> arrays = new ArrayList<>();
        arrays.add(1);      //自动装箱
        int i = arrays.get(0);      //自动拆箱，调用了intValue方法，将Interger包装类转换成int这种基本数据类型
        System.out.println(i);
    }
}
