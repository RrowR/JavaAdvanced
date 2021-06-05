package com.study.Demo04;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 */
public class CalendarDemo2 {
    public static void main(String[] args) {
//        demo01();
//        demo02();
//        demo03();
        demo04();
    }

    /**
     * Date getTime();      //这个是把日期转换成毫秒值，不好搞混了
     * Date time = c.getTime();     把日历对象转换成日期对象,这里的c是Calendar里面的方法
     */
    private static void demo04() {
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd");
        String format = simpleDateFormat.format(time);
        System.out.println(c);
        System.out.println(format);

       // System.out.println(time);       //Fri Jun 04 21:32:45 CST 2021

    }

    /**
     *  public abstract void add(int field,int amount)根据日历的规则，将指定的时间量添加或减去给定的日历字段。
     *      field:传入指定的日历字段(YEAR、MONTH...)
     *      amount:正数增加/负数减少
     */
    private static void demo03() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,3);
//        c.add(Calendar.YEAR,-2);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

    }

    /**
     * public void set(int field,int value)将给定的日历字段设置为给定的值。 该方法不会解释该值，无论宽恕方式如何。
     */
    private static void demo02() {
        Calendar c = Calendar.getInstance();
        //同时设置年月日，有重载的方法，一个/两个/三个都行
        c.set(1998,04,27);

//        c.set(Calendar.YEAR,9999);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

//        c.set(Calendar.MONTH,4);
        int Month = c.get(Calendar.MONTH);
        System.out.println(Month);

//        c.set(Calendar.DATE,2);
        int day = c.get(Calendar.DATE);
        System.out.println(day);


    }

    /**
     * public int get(int field) 返回给定日历字段的值。
     */
    private static void demo01() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);        //这是成员变量Calendar的方法get
        System.out.println("年："+year);

        int month = c.get(Calendar.MONTH);
        System.out.println("月:"+ (month+1));          // 西方：0~11  东方：1~12

        int Date = c.get(Calendar.DATE);        // DATE 月中的某一天
        System.out.println("天："+Date);

        int minute = c.get(Calendar.MINUTE);       //分钟
        System.out.println("分钟："+minute);

        int second = c.get(Calendar.SECOND);        //秒
        System.out.println("秒："+second);

        int hour = c.get(Calendar.HOUR);
        System.out.println("小时："+hour);

        int DAY_OF_MONTH = c.get(Calendar.DAY_OF_MONTH);
        System.out.println("一个月的第" + DAY_OF_MONTH + "天");


    }
}
