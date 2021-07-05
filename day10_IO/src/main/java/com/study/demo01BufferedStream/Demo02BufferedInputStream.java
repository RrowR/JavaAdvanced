package com.study.demo01BufferedStream;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * java.lang.Object
 *  继承者 java.io.InputStream
 *   继承者 java.io.FilterInputStream
 *    继承者 java.io.BufferedInputStream
 * 构造方法：
 * BufferedInputStream(InputStream in) 创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
 * BufferedInputStream(InputStream in, int size) 创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
 */
public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day10_IO/a.txt"));
        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1){
            // 打印由字节数组转换成字符串的数据，可以指定长度
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
    }
}
