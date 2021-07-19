package com.study.demo03Serilizable;

import java.io.*;
import java.util.ArrayList;

public class Demo03SerializableArrays {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10_IO/serializable.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10_IO/serializable.txt"));
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("张三", 22));
        arrayList.add(new Person("李四",23));
        arrayList.add(new Person("王五",24));
        oos.writeObject(arrayList);
        Object o = ois.readObject();
        ArrayList<Person> people = (ArrayList<Person>) o;
        for (Person person : people) {
            System.out.println(person);
        }
        oos.close();
        ois.close();
    }
}
