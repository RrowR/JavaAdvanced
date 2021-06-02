package com.study;

public class Demo02Equals {
    public static void main(String[] args) {
        Person mm = new Person("美美", 8);
        Person jh = new Person("镜华", 9);
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
        jh = mm;
        System.out.println(mm);
        System.out.println(jh);
        System.out.println(b);          //值为false
    }
}
