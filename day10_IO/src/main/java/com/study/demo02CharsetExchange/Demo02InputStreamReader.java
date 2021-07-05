package com.study.demo02CharsetExchange;

import java.io.*;

/**
 * java.lang.Object
 *  继承者 java.io.Reader
 *    继承者 java.io.InputStreamReader
 *      继承者 java.io.FileReader
 * java.lang.Object
 *   继承者 java.io.InputStream
 *    继承者 java.io.FileInputStream
 *  InputStreamReader(InputStream in) 创建一个使用默认字符集的 InputStreamReader。
 *  InputStreamReader(InputStream in, Charset cs) 创建使用给定字符集的 InputStreamReader。
 *  InputStreamReader 是字节流通向字符流的桥梁：它使用指定的 charset 读取字节并将其解码为字符。它使用的字符集可以由名称指定或显式给定，或者可以接受平台默认的字符集。
 *   void close() 关闭该流并释放与之关联的所有资源。
 *   String getEncoding() 返回此流使用的字符编码的名称。
 *   int read() 读取单个字符。
 *   int read(char[] cbuf, int offset, int length) 将字符读入数组中的某一部分。
 *   boolean ready() 判断此流是否已经准备好用于读取。
 */
public class Demo02InputStreamReader {
    public static void main(String[] args) throws IOException {
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_IO/a.txt"), "gbk");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_IO/a.txt"), "utf-8");
        int len;
        char[] c = new char[1024];
        // 这里只能传字符数组而不是字节
        while ((len = isr.read(c)) != -1) {
            System.out.println(c);
        }
        isr.close();
    }
}
