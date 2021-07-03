package com.study.demo04charstream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * java.lang.Object
 *   继承者 java.io.Reader
 *      继承者 java.io.InputStreamReader
 *          继承者 java.io.FileReader
 *   public abstract class Reader extends Object implements Readable, Closeable  所有字符输入流的父类，定义了公共的方法，是一个抽象类
 *   int read() 读取单个字符
 *   int read(char[] cbuf) 将字符读入数组
 *   abstract void close() 关闭该流并释放与之关联的所有资源
 *
 *   FileReader(File file) 在给定从中读取数据的 File 的情况下创建一个新 FileReader
 *   FileReader(String fileName) 在给定从中读取数据的文件名的情况下创建一个新 FileReader
 *
 */
public class Demo02InputStreamReader {
    public static void main(String[] args) throws IOException {
//        FileReaderStringParameter();
//        FileReaderFileParameter();
        FileReaderFileParameter2();
    }

    private static void FileReaderFileParameter2() throws IOException {
        File file = new File("day09_IOAndProperties/c.txt");
        FileReader fr = new FileReader(file);
        char[] c = new char[1024];
        int len;
        while ((len = fr.read(c)) != -1){
            // String(char[] value, int offset, int count) 使用String类的构造方法，将字节数组转换成String类型
            System.out.println(new String(c,0,c.length));
        }
        fr.close();
    }

    private static void FileReaderFileParameter() throws IOException {
        File file = new File("day09_IOAndProperties/c.txt");
        FileReader fr = new FileReader(file);
        int len;
        while ((len = fr.read()) != -1){
            System.out.println((char)(len));
        }
        fr.close();
    }

    private static void FileReaderStringParameter() throws IOException {
        FileReader fr = new FileReader("day09_IOAndProperties/c.txt");
        int len;
        while ((len = fr.read()) != -1){
            System.out.println((char)(len));
            System.out.println("长度为"+len);
        }
        fr.close();
    }
}
