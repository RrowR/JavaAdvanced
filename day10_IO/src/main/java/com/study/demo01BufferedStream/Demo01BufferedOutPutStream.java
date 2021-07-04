package com.study.demo01BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  java.lang.Object
 *   继承者 java.io.OutputStream
 *       继承者 java.io.FilterOutputStream
 *           继承者 java.io.BufferedOutputStream
 *  由于继承了OutPutStream，所以可以调用OutPutStream里的所有方法
 *  BufferedOutputStream(OutputStream out) 创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
 *  BufferedOutputStream(OutputStream out, int size) 创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流。
 */
public class Demo01BufferedOutPutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day10_IO\\a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("使用bufferedoutputstring来写出".getBytes());
        bos.close();
    }
}
