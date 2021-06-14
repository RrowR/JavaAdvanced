package com.study.demo02Exception;

import java.io.IOException;

public class Demo02TryCatch {
    public static void main(String[] args) {
        try {
            readFile("E:\\a.sss");
            System.out.println("try里的后续代码");        //当出现异常的时候，这段代码也不会被执行，因为这个方法在try里面
        } catch (IOException e) {
            /*
                Throwable类中定义了3个异常处理的方法,这个类是Exception和Error的父类
                 String getMessage() 返回此 throwable 的简短描述。
                 String toString() 返回此 throwable 的详细消息字符串。
                 void printStackTrace()  JVM打印异常对象,默认此方法,打印的异常信息是最全面的
             */
            /**
                System.out.println(e.getMessage());     // 文件的后缀名不对
                System.out.println(e);
                System.out.println(e.toString());       // java.io.IOException: 文件的后缀名不对，这个类重写了Object里的toString()方法,所以上面不使用toString也是可以的
            */
            /**
             *  java.io.IOException: 文件的后缀名不对(显示位置、原因、内容)
             * 	at com.study.demo02Exception.Demo02TryCatch.readFile(Demo02TryCatch.java:26)
             * 	at com.study.demo02Exception.Demo02TryCatch.main(Demo02TryCatch.java:8)
             */
            e.printStackTrace();
        }
        System.out.println("主方法里的后续代码");            //这段代码会被执行,即使出现了异常，因为catch了，但是它又不在try里，所以会继续执行
    }

    private static void readFile(String filepath) throws IOException {
        if (!filepath.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        //当if条件成立抛出异常的时候，这段代码是不会被执行的，因为这里没有被try/catch，出现异常不会继续往下执行
        System.out.println("后续代码");
    }
}
