package com.study.Demo04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date日期类的总结
 */
public class DateClassSummary {
    public static void main(String[] args) throws ParseException {
//        DateTime();
//        CustomSimpleDateFormat();
        ParseDate();
    }

    private static void ParseDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年-MM月-dd日");
        Date parse = simpleDateFormat.parse("2019年-1月-5日");
        System.out.println(parse);          // 将指定格式和指定输入转换成系统字符串 Tue Feb 19 00:00:00 CST 2019
    }

    private static void CustomSimpleDateFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年-MM月-dd日 HH:mm:ss");         //指定字符串格式转成相应的日期格式
        String export = simpleDateFormat.format(new Date());        //将转入的日期转成对应的格式
        System.out.println(export);     //输出转成格式的日期
    }

    private static void DateTime() {
        Date date = new Date();         //空参方法
        System.out.println("当前系统时间为:"+date);       //Sat Jun 05 15:30:22 CST 2021获取当前系统的时间
        System.out.println("当前系统时间为:"+date.toLocaleString());       //根据本地的时间来显示日期  2021-6-5 15:43:48
        Date date1 = new Date(13213212312345L);       //有参构造就是在格林威治时间里加上多少毫秒，如果不加上L长度会有限制     Sat Sep 17 00:45:12 CST 2388
        System.out.println(date1);
    }
}
