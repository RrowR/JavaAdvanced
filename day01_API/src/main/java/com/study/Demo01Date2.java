package com.study;

import java.util.Date;

public class Demo01Date2 {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }

    private static void demo04() {
        /**
         * Date类 getTime()
         * 返回自1970年1月1日以来，由此Date对象表示的00:00:00 GMT以来的毫秒数 。
         */
        //日期转毫秒
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);           //1622651031791

    }

    //毫秒转日期
    private static void demo03() {
        //有参构造方法
        Date date = new Date(12132222111123L);          //将毫秒值转换为Date日期 格林威治时间+毫秒值      Wed Jun 16 13:41:51 CST 2354
        System.out.println(date);
    }

    private static void demo02() {
        Date date = new Date(0L);           //返回格林威治时间      Thu Jan 01 08:00:00 CST 1970
        System.out.println(date);
    }

    private static void demo01() {
        //无参构造方法
        Date date = new Date();             //返回当前时间        Thu Jun 03 00:23:51 CST 2021
        System.out.println(date);
    }
}
