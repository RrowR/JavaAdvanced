package com.study.demo01outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java.lang.Object
 *   继承者 java.io.OutputStream
 *      public abstract class OutputStream extends Objectimplements Closeable, Flushable
 *      此抽象类是表示 输出字节流 的所有类的超类。输出流接受输出字节并将这些字节发送到某个接收器
 *      需要定义 OutputStream 子类的应用程序必须始终提供至少一种可写入一个输出字节的方法
 *          void close() 关闭此输出流并释放与此流有关的所有系统资源。
 *          void flush() 刷新此输出流并强制写出所有缓冲的输出字节。
 *          void write(byte[] b) 将 b.length 个字节从指定的 byte 数组写入此输出流。
 *          void write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
 *          void write(int b) 将指定的字节写入此输出流。
 *
 *      java.lang.Object
 *       继承者 java.io.OutputStream
 *        继承者 java.io.FileOutputStream
 *        public class FileOutputStream extends OutputStream
 *        构造方法摘要：
 *          FileOutputStream(File file) 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 *          FileOutputStream(String name) 创建一个向具有指定名称的文件中写入数据的输出文件流。
 *
 */
public class Demo01OutPutStream {
    public static void main(String[] args) throws IOException {
        // 创建 FileOutputStream 对象
        FileOutputStream fileOutputStream = new FileOutputStream(new File("day09_IOAndProperties\\a.txt"));
        // void write(int b) 将指定的字节写入此输出流
        fileOutputStream.write(97);     // 97 的ASCII码就是 a
        // 关闭输出流
        fileOutputStream.close();
    }
}
