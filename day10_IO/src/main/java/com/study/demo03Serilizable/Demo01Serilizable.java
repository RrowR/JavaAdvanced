package com.study.demo03Serilizable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *  使用序列化流将对象写入到文件中
 *  java.lang.Object
 *   继承者 java.io.OutputStream
 *       继承者 java.io.ObjectOutputStream
 *
 *       构造方法：
 *       protected  ObjectOutputStream()
 *           为完全重新实现 ObjectOutputStream 的子类提供一种方法，让它不必分配仅由 ObjectOutputStream 的实现使用的私有数据。
 *       ObjectOutputStream(OutputStream out)
 *           创建写入指定 OutputStream 的 ObjectOutputStream。
 *
 *           java.lang.Object
 *              继承者 java.io.OutputStream            这是一个抽象类，直接传入的话要实现里面的方法
 *                  继承者 java.io.FileOutputStream
 */
public class Demo01Serilizable {
    public static void main(String[] args) throws IOException {
        // 这里可以传入OutputSteam的子类
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10_IO/Person.txt"));
        // 将对象写入到指定文件中
        oos.writeObject(new Person("咚咚",23));
        // 关闭流
        oos.close();
    }
}
