package com.study.demo04charstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * public abstract class Writer extends Object          是所有字符流的父类，是一个抽象类
 *    void write(int c)` 写入单个字符
 *    void write(char[] cbuf) `写入字符数组
 *    abstract  void write(char[] cbuf, int off, int len) `写入字符数组的某一部分,off数组的开始索引,len写的字符个数 
 *    void write(String str) `写入字符串
 *    void write(String str, int off, int len)` 写入字符串的某一部分,off字符串的开始索引,len写的字符个数
 *    void flush() `刷新该流的缓冲
 *    void close()` 关闭此流，但要先刷新它
 *
 *  java.lang.Object
 *   继承者 java.io.Writer
 *       继承者 java.io.OutputStreamWriter
 *           继承者 java.io.FileWriter
 *           FileWriter 文件字符输出流，把内存中的数据写到文件中，和FileOutputStream不同的是，这个是文件内容的复制，FileOutputStream是复制文件等等用的
 *   构造方法：
 *      FileWriter(File file) 根据给定的 File 对象构造一个 FileWriter 对象
 *      FileWriter(String fileName) 根据给定的文件名构造一个 FileWriter 对象。
 *      FileWriter(String fileName, boolean append) 根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象
 *
 */


public class Demo03Writer {
    public static void main(String[] args) throws IOException {
//        fileContentCopy();
//        flushTestMethod();
        FileWriter fw = new FileWriter("day09_IOAndProperties/d.txt",true);
        char[] c = {'a','b','c','d','e'};
//        fw.write(c);
//        fw.write("叮咚叮咚");            // 写入一个字符串
//        fw.write(c,0,3);        // 写入指定字符位置的数据
        fw.write("my name is Rrow",1,9);        // 写定指定位置的字符串，len是写定字符的个数
        fw.close();
    }

    private static void flushTestMethod() throws IOException {
        FileWriter fw = new FileWriter("day09_IOAndProperties/d.txt");
        for (int i = 1; i <= 100; i++) {
            fw.write(i);
            fw.flush();     //  这里我使用jdk9 貌似不用刷新
        }
        fw.close();
    }

    /*
     *   实现文件内容复制的功能
     */
    private static void fileContentCopy() throws IOException {
        FileReader fr = new FileReader("day09_IOAndProperties/c.txt");      // 创建字符输入流，读取目标文件的内容
//        FileWriter fw = new FileWriter("day09_IOAndProperties/d.txt");      // 创建字符输出流，写出字符到目标文件(tip:可以没有目标地址也可以的)
        FileWriter fw = new FileWriter("day09_IOAndProperties/d.txt",true);      // true 开启
        char[] c = new char[1024];    // 设置一个字符数组，长度最好为1024的整数倍
        int len;
        while ((len = fr.read(c)) != -1){
            fw.write(c);
            fw.flush();
        }
        fw.close();
        fr.close();
    }
}
