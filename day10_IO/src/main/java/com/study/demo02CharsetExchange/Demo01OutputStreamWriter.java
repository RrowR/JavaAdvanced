package com.study.demo02CharsetExchange;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * java.lang.Object
 *   继承者 java.io.Writer
 *       继承者 java.io.OutputStreamWriter
 *        void close() 关闭此流，但要先刷新它。
 *        void flush() 刷新该流的缓冲。
 *        String getEncoding() 返回此流使用的字符编码的名称。
 *        void write(char[] cbuf, int off, int len) 写入字符数组的某一部分。
 *        void write(int c) 写入单个字符。
 *        void write(String str, int off, int len) 写入字符串的某一部分。
 * OutputStreamWriter(OutputStream out) 创建使用默认字符编码的 OutputStreamWriter 默认使用UTF-8，而且不区分大小写
 * OutputStreamWriter(OutputStream out, Charset cs) 创建使用给定字符集的 OutputStreamWriter
 */
public class Demo01OutputStreamWriter {
    public static void main(String[] args) throws IOException {
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10_IO/a.txt"));
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10_IO/a.txt"),"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10_IO/a.txt"),"GBK");
        osw.write("你好呀");
        osw.flush();
        osw.close();
    }
}
