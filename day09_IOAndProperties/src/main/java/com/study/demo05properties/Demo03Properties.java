package com.study.demo05properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * void load(InputStream inStream) 从输入流中读取属性列表（键和元素对）
 * void load(Reader reader) 按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）
 */
public class Demo03Properties {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.load(new FileReader("day09_IOAndProperties/prop.txt"));
        // 当读取中文时，使用输入流会出现乱码
//        props.load(new FileInputStream("day09_IOAndProperties/prop.txt"));
        Set<String> set = props.stringPropertyNames();
        for (String key : set) {
            System.out.println(key+"="+props.getProperty(key));
        }
    }
}
