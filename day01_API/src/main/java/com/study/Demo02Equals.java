package com.study;

import java.util.Random;

public class Demo02Equals {
    public static void main(String[] args) {
        Person mm = new Person("美美", 8);
        Person jh = new Person("美美", 8);
        boolean b = mm.equals(jh);
        /*     源码
        *     public boolean equals(Object obj) {
                return (this == obj);
                * this就是方法的调用者，obj就是传入的参数对象
                * 所以this == obj  ==> mm == jh  默认比较的是地址值是否相等
                *
                * ==是一个比较运算符  返回值是一个boolean类型
                * 基本数据类型：比较的是值
                * 引用数据类型：比较的是两个对象的地址值  (堆)
                *
               }
        * */
        /*
        这里值一样的原因是让jh == mm,使他们等于同一个堆内存地址
        jh = mm;
        System.out.println(mm);
        System.out.println(jh);
        */
        /*  这里通过重写equals方法，使他们比较的是值，这样才有可比较性
        System.out.println(mm);
        System.out.println(jh);*/

//          这里其实也有一个问题，当传入的参数不是Person的时候，这样就会报错 ClassCastException （类型转换异常），所以equals代码要进行优化一下，加上判断是否一个Person对象
//        Random random = new Random();
//        boolean b1 = mm.equals(random);

        boolean b2 = mm.equals(mm);




        System.out.println(b2);
    }
}
