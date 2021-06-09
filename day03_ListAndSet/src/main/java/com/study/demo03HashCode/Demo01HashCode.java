package com.study.demo03HashCode;

/** Object里的方法，native表示调用的是本地操作系统的方法
 *   public native int hashCode();
 */
public class Demo01HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.hashCode());      //1956725890    DEC 十进制
        System.out.println(p1);     //com.study.demo03HashCode.Person@74a14482  74a14482是1956725890的HEX表现形式
        System.out.println(p2.hashCode());      //356573597
        System.out.println(p2);     //com.study.demo03HashCode.Person@1540e19d
        System.out.println(p1==p2);     //比较的是引用数据类型（堆地址），即使你重写了hashcode返回值也会是false

        //相同字符串打印的Hash值是相等的
        String s1 = "aaa";
        String s2 = "aaa";
        System.out.println(s1.hashCode());  //96321
        System.out.println(s2.hashCode());  //96321
        System.out.println(s1==s2);     //false

        //非常巧合的字符串
        System.out.println("重地".hashCode());        //1179395
        System.out.println("通话".hashCode());        //1179395


    }
}
