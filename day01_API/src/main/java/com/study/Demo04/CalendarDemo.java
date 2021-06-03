package com.study.Demo04;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        /**
         * public static Calendar getInstance()使用默认时区和区域设置获取日历。 Calendar返回的是基于默认时区的当前时间，默认为FORMAT区域设置。
         */
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}
