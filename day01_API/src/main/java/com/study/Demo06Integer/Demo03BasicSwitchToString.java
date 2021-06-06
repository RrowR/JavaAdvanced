package com.study.Demo06Integer;

/**
 *     基本类型与字符串类型之间的相互转换
 *     基本类型->字符串(String)
 *         1.基本类型的值+""  最简单的方法(工作中常用)
 *         2.包装类的静态方法toString(参数),不是Object类的toString() 重载
 *             static String toString(int i) 返回一个表示指定整数的 String 对象。
 *         3.String类的静态方法valueOf(参数)
 *             static String valueOf(int i) 返回 int 参数的字符串表示形式。
 *     字符串(String)->基本类型
 *         使用包装类的静态方法parseXXX("字符串");
 *             Integer类: static int parseInt(String s)
 *             Double类: static double parseDouble(String s)
 *  */
public class Demo03BasicSwitchToString {
    public static void main(String[] args) {
        /**
         * 基本数据类型转换成字符串类型
         */
        int a = 1;
        String s1 = a + "";      //在后面拼接一个""即可将基本数据类型转换成字符串（常用）
        System.out.println(s1+200);     //结果为1200

        String s2 = Integer.toString(1);    //调用Integer的toString方法将包装类转换成字符串
        System.out.println(s2+3);           //结果为13

        String s = String.valueOf(111);         //调用String里的valueof将基本数据类型转换为字符串
        System.out.println(s+2);            //1112
        /**
         * 字符串类型转换成基本数据类型
         */
        int i = Integer.parseInt("222");        //使用Integer里的parseInt方法将字符串类型转换成基本数据类型
        System.out.println(i+3);            //结果为225

        double b = Double.parseDouble("22.33");     //使用Double包装类的parseDouble方法将字符串转换成double基本类型
        System.out.println(b+2.0);      //结果为24.33

    }
}
