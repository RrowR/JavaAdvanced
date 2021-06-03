package com.study.Demo03DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.DateFormat 是一个抽象类，无法直接使用，但是可以使用它的子类  SimpleDateFormat
 * 格式化：日期->文本   解析：文本->日期
 *
 * String format(Date date)
 * 将日期格式化成日期/时间字符串。
 *
 * Date parse(String source)
 * 从给定字符串的开始解析文本以生成日期。
 *
 * public class SimpleDateFormat extends DateFormat
 * SimpleDateFormat(String pattern)
 * 使用给定模式 SimpleDateFormat并使用默认的 FORMAT语言环境的默认日期格式符号。
 *  里面传的pattern模式指的其实就是yy-MM-dd HH:mm:ss 类似这种，具体参考笔记
 */
public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    /**
     * 解析方法的使用:
     *  使用DateFormat类中的方法parse,把文本解析为日期
     *  Date parse( String source）把符合模式的字符串,解析为Date日期使用步骤:
     *  1.创建simpleDateFormat对象,构造方法中传递指定的模式
     *  2.调用SimpleDateFormat对象中的方法parse,把符合构造方法中模式的字符串,解析为Date日期
     *      注意：在DateFormat中的parse方法中，会申明一个异常，我们需要处理这个异常，目前我们只先处理，抛出即可，后面再进行学习
     *          在这个parse方法中，如果传入的pattern与解析的字符串格式不一致会报异常    Exception in thread "main" java.text.ParseException: Unparseable date: "21年06月03日 10时58分32"
     */
    private static void demo02() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy年MM月dd日 HH时mm分ss秒");
        /**
         *     public Date parse(String source) throws ParseException
         *     {
         *         ParsePosition pos = new ParsePosition(0);
         *         Date result = parse(source, pos);
         *         if (pos.index == 0)
         *             throw new ParseException("Unparseable date: \"" + source + "\"" ,
         *                 pos.errorIndex);
         *         return result;
         *     }
         */
        Date parse = simpleDateFormat.parse("21年06月03日 10时58分32秒");
        System.out.println(parse);
    }

    private static void demo01() {
        /**
         * 使用DateFormat类中的方法format,把日期格式化为文本
         * String format(Date date)按照指定的模式,把Date日期,格式化为符合模式的字符串使用步骤:
         * 1.创建simpLeDateFormat对象,构造方法中传递指定的模式
         * 2.调用SimpLeDateFormat对象中的方法format ,按照构造方法中指定的模式,把Date日期格式化为符合模式的字符串(文本)
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy年MM月dd日 HH时mm分ss秒");
        String format = simpleDateFormat.format(new Date());        //这个format方法是SimpledateFormat方法的父类DateFormat方法里的
        System.out.println(format);
    }
}
