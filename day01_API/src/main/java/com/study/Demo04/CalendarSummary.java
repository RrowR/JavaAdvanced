package com.study.Demo04;

import java.util.Calendar;

public class CalendarSummary {
    public static void main(String[] args) {
//        getCalendarMethod();
//        SetCalendarMethod();
        CalendarAddMethod();
    }

    private static void CalendarAddMethod() {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.YEAR,1);      //  正数为 加  负数为 减
        System.out.println(instance.get(Calendar.YEAR));
    }


    private static void SetCalendarMethod() {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.YEAR,9999);
        System.out.println(instance.get(Calendar.YEAR));
    }

    private static void getCalendarMethod() {
        //创建当前日历类的实例
        Calendar instance = Calendar.getInstance();
        //获取年
        int year = instance.get(Calendar.YEAR);
        System.out.println(year);
    }
}
