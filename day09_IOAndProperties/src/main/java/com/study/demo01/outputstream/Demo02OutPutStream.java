package com.study.demo01.outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 原理：将输入的字节转换成二进制，根据文本的编码格式(默认ASCII码)，将这个二进制对应的值转换成ASCII码值
 */
public class Demo02OutPutStream {
    public static void main(String[] args) throws IOException {
        // 创建 FileOutputStream 对象
        // 注意，当传入的是一个 dir/file 时，如果dir不存在会找不到路径
        FileOutputStream fos = new FileOutputStream(new File("day09_IOAndProperties\\b.txt"));
        // void write(int b) 将指定的字节写入此输出流
        /*
        fos.write(49);     // 49 对应的二进制 ASCII 是 1
        fos.write(48);     // 48 对应的是 0
        fos.write(48);     // 0
        */
        // void write(byte[] b) 将 b.length 个字节从指定的 byte 数组写入此输出流。
//         byte[] b = {67,68,69};         // 65 是 A
        // void write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流
//        fos.write(b,1,1);       // 只写入 68
        // java.lang.String 方法中有一个getBytes方法，将字符串转换为字节数组
        String name = "my name is Rrow";
        byte[] bytes = name.getBytes();     // [109, 121, 32, 110, 97, 109, 101, 32, 105, 115, 32, 82, 114, 111, 119]
        /**
         * java.lang.Object
         *   继承者 java.util.Arrays 此类包含用来操作数组（比如排序和搜索）的各种方法.
         */
        System.out.println(Arrays.toString(bytes));
        // 传入字节数组，再进行打印，可以看到FileOutputStream里对应路径的文件内容就是String里的内容
        /**
         * 分析： 将String类型转换为字节数组，将转换的字节数组输出到文件中时，文件会根据默认的ASCII表将字节数组转换为中文
         * 所以结果就是一开始输入的String类型
         */
        fos.write(bytes);
        // 关闭输出流
        fos.close();
    }
}
