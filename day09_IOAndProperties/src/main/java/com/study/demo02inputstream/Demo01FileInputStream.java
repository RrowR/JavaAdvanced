package com.study.demo02inputstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * java.lang.Object
 *   继承者 java.io.InputStream
 *   public abstract class InputStream extends Object implements Closeable
 *      public void close() ：关闭此输入流并释放与此流相关联的任何系统资源
 *      public abstract int read()： 从输入流读取数据的下一个字节
 *      public int read(byte[] b)： 从输入流中读取一些字节数，并将它们存储到字节数组 b中
 *
 *      子类FileInputStream的构造方法
 *      FileInputStream(File file) 通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定
 *      FileInputStream(String name) 通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
 */
public class Demo01FileInputStream {
    public static void main(String[] args) throws IOException {
        // 传入指定路径的文件来进行读取
        FileInputStream fis = new FileInputStream("day09_IOAndProperties\\a.txt");
        /*
        int read = fis.read();          // 返回下一个字节，但是打印的时候是将这个1个字节转换成了10进制
        System.out.println(read);       // 97
        int read2 = fis.read();
        System.out.println(read2);      // 98
        int read3 = fis.read();
        System.out.println(read3);      // 99
        int read4 = fis.read();
        System.out.println(read4);      // -1       当下一个字节为空的时候返回空
        */
        // 可以看出，上面的代码非常冗余，可以使用while循环来进行优化
        long lenth;
        while ((lenth = fis.read()) != -1){     // 将读取的字节赋值给lenth，然后打印lenth，当为-1的时候终止
            // System.out.println(lenth);
            // 我们也可以再将这个 字节强转成char类型,将这个字节再次转换成原先的字符
            System.out.print((char) lenth);
        }



        fis.close();

    }
}
