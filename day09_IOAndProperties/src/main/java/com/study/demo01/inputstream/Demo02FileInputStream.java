package com.study.demo01.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 一次读取多个字节
 *   int read(byte[] b) 从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
 *   int read(byte[] b, int off, int len) 从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。
 */
public class Demo02FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day09_IOAndProperties/a.txt");
        // 定义一个字节数组，目的就是为了让FileInputStream去读取指定个数的字节数
//        byte[] b = new byte[2];
        // 返回值是一个有效的内容个数，fis.read(byte[] b) 是将数据传入到byte数组中，具体传入多少看这个数组的容量有多大
//        int length = fis.read(b);       // 2
        /**
         * String(byte[] bytes) 通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String
         * 将字节数组转换成字符串
         */
        /*
        System.out.println(new String(b));      // AB
        int read = fis.read(b);
        System.out.println(read);          // 2
        System.out.println(new String(b));      // CD
        int read1 = fis.read(b);
        System.out.println(read1);         // 1
        System.out.println(new String(b));      // ED
        */
        // 上述代码过于冗余，优化一下
        byte[] b = new byte[1024];  // 这里一般要设置成1024的倍数
        int len = 0;
        while ((len = fis.read(b)) != -1){
            // System.out.println(new String(b));      // 但是这里会输出很多空格,引入下面的方法
            // String(byte[] bytes, int offset, int length) 通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。
            System.out.println(new String(b,0,len));
        }
        fis.close();
    }
}
