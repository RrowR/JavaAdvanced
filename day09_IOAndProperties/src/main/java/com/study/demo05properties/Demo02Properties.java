package com.study.demo05properties;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 *  Properties里的store方法，一个是传入字节输出流，一个是传入字符输出流
 *  void store(OutputStream out, String comments) 以适合使用 load(InputStream) 方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流。
 *  void store(Writer writer, String comments) 以适合使用 load(Reader) 方法的格式，将此 Properties 表中的属性列表（键和元素对）写入输出字符。
 */
public class Demo02Properties {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.setProperty("镜华","12");
        props.setProperty("美美","10");
        props.setProperty("猫羽雫", "16");
        // 这里的comment不能使用中文，因为默认使用的是Unicode编码，我们这里是UTF-8
//        props.store(new FileWriter("day09_IOAndProperties/prop.txt"),"FileWriter save data");
        // 使用字节输出流输出中文会出现乱码
        props.store(new FileOutputStream("day09_IOAndProperties/prop2.txt"),"FileOutputStream save data");
    }
}
