package com.study.demo03Serilizable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *  反序列化流，将文件里存储的对象读取出来
 *
 *  java.lang.Object
 *   继承者 java.io.InputStream
 *       继承者 java.io.ObjectInputStream
 *
 *       构造方法：
 *          ObjectInputStream(InputStream in)  同样可以传入InputStream的子类FileInputStream
 *           创建从指定 InputStream 读取的 ObjectInputStream。
 *
 *   使用前提：
 *      1.必须有实现Serilizable接口的对象
 *      2.必须有这个对象的.class文件
 */
public class Demo02deserilizable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10_IO/Person.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
        Person p = (Person) o;
        System.out.println(p.getName()+p.getAge());
    }
}
