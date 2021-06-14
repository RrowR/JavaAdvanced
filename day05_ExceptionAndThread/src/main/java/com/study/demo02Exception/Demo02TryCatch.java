package com.study.demo02Exception;

import java.io.IOException;

public class Demo02TryCatch {
    public static void main(String[] args) {
        try {
            readFile("E:\\a.dsd");
            System.out.println("try里的后续代码");        //没有被执行
        } catch (IOException e) {
            /*
                Throwable类中定义了3个异常处理的方法,这个类是Exception和Error的父类
                 String getMessage() 返回此 throwable 的简短描述。
                 String toString() 返回此 throwable 的详细消息字符串。
                 void printStackTrace()  JVM打印异常对象,默认此方法,打印的异常信息是最全面的
             */
            System.out.println(e.getMessage());     // 文件的后缀名不对
            System.out.println(e);
            System.out.println(e.toString());       // java.io.IOException: 文件的后缀名不对，这个类重写了Object里的toString()方法,所以上面不使用toString也是可以的
            /**
             * java.io.IOException: 文件的后缀名不对(显示位置、原因、内容)
             * 	at com.study.demo02Exception.Demo02TryCatch.readFile(Demo02TryCatch.java:26)
             * 	at com.study.demo02Exception.Demo02TryCatch.main(Demo02TryCatch.java:8)
             */
            e.printStackTrace();
        }
    }

    private static void readFile(String filepath) throws IOException {
        String file = "E:\\a.txt";
        if (!file.endsWith(filepath)){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("后续代码");
    }
}
