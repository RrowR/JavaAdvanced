package com.study.demo01.outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02OutPutStream {
    public static void main(String[] args) throws IOException {
        // 创建 FileOutputStream 对象
        // 注意，当传入的是一个 dir/file 时，如果dir不存在会找不到路径
        FileOutputStream fos = new FileOutputStream(new File("day09_IOAndProperties\\b.txt"));
        // void write(int b) 将指定的字节写入此输出流
        fos.write(49);     // 49 对应的二进制 ASCII 是 1
        fos.write(48);
        fos.write(48);
        // 关闭输出流
        fos.close();
    }
}
