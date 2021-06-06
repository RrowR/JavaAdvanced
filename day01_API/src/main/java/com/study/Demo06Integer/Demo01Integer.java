package com.study.Demo06Integer;

/**
 * 装箱：
 *      Integer(int value) 构造一个新分配的 Integer对象，该对象表示指定的 int值。
 *      Integer(String s)  构造一个新分配 Integer对象，表示 int由指示值 String参数。   这里的String只能是"111"这种才能转换成整型
 *      int intValue() 将 Integer的值转换为 int类型
 */
public class Demo01Integer {
    public static void main(String[] args) {
        Integer in1 = new Integer(1);
        System.out.println(in1);        //说明了Integer包装类重写了toString方法
        Integer in2 = new Integer("111");   //传入了一个基本数据类型的字符串
        System.out.println(in2);

        int intValue1 = in1.intValue();     //将Integer包装类型转换成int类型
        System.out.println(intValue1);
    }
}
