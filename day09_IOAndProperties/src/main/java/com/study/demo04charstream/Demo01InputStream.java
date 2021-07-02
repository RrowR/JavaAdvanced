package com.study.demo04charstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *  UTF-8 : 1个中文等于3个字符
 *  GBK:    1个中文等于2个字符
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day09_IOAndProperties/c.txt");
        int len = 0;
        while ((len = fis.read()) != -1){
            System.out.print((char) len);         // 将每次读取的1个二进制转10进制的数转换成char类型就会出现乱码
        }
        fis.close();
    }
}
