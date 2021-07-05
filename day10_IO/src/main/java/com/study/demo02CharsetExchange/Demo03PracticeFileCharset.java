package com.study.demo02CharsetExchange;

import java.io.*;

/**
 * 转换文件编码练习：
 *      将文件类型编码转换成另一个文件类型编码
 */
public class Demo03PracticeFileCharset {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_IO/a.txt"), "utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10_IO/b.txt"), "GBK");
        char[] c = new char[1024];
        int len;
        while ((len = isr.read(c)) != -1){
            osw.write(c,0,len);
        }
        osw.close();
        isr.close();
    }
}
