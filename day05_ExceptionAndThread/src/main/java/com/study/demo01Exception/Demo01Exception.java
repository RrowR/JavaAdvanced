package com.study.demo01Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.lang
 *      类 Throwable
 * java.lang.Object
 *      继承者 java.lang.Throwable
 * 所有已实现的接口：
 *      Serializable
 * 直接已知子类：
 *      Error, Exception
 *      异常处理的方式有2种：
 *          1.抛出，当出现异常时会抛出异常，程序被终止
 *          2.try/catch try程序出现异常的时候，程序会执行catch方法，此时程序会继续执行不会终止，只是try内容会执行不成功   而已
 *
 *      其中Exception中的RuntimeException是一个运行期间的异常
 */
public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = null;
        try {
            parse = simpleDateFormat.parse("1998-0427");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(parse);
        System.out.println("程序继续执行");*/
        /**
         * 运行时异常
         */
        int[] arr = {1,2,3};
        System.out.println(arr[3]);     //ArrayIndexOutOfBoundsException 运行时异常


    }
}
