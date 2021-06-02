package com.study;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01String {
    public static void main(String[] args) {
        Person p = new Person("张三", 18);
        System.out.println(p.toString());
        System.out.println(p);

        //没有重写toString
        Random random = new Random();
        System.out.println(random);

        //重写了toString
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);

        //重写了toString
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
}
