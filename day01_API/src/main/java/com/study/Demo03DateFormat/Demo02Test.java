package com.study.Demo03DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 练习：
 *     计算从出生到现在经历了多少天?
 */
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        //给DateFormat的子类设置pattern格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd");
        //使用Scanner进行输入监听
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入时间格式为yy-MM-dd");
        //获取输入过来的字符串
        String next = scanner.next();
        //通过simpledateformat来解析字符串获得时间Date
        Date parse = simpleDateFormat.parse(next);
        //把Date转换成毫秒值
        long time2 = parse.getTime();
        //获取当前系统时间
        Date date = new Date();
        //转换当前系统时间的毫秒值
        long time1 = date.getTime();
        //逻辑判断加减方向
        long time;
        if (time1 >= time2){
            time = time1 - time2;
        }else {
            time = time2 - time1;
        }
        //输出时间间隔
        System.out.println("相差的时间为:"+time/(1000*60*60*24)+"天");

    }
}
