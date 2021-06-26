package com.study.demo05HasParameterLambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01SortByLambda {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("镜华", 9),
                new Person("美美", 8),
                new Person("猫羽雫",14)
        };

        //这里使用的是java.lang包下的sort方法，传入需要排序的集合，一个比较器接口的匿名实现方法
        Arrays.sort(arr, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        // o1 - o2 为升序
                        return o1.getAge() - o2.getAge();
                    }
                });

        //使用lambda表达式
        Arrays.sort(arr,(Person o1, Person o2)->{
            //倒序 右减左
            return o2.getAge() - o1.getAge();
        });

        //使用lambda表达式,简写
        Arrays.sort(arr,(o1,o2)-> o2.getAge() - o1.getAge());

        for (Person person : arr) {
            System.out.println(person);
        }

    }
}
