package com.study.demo02Set;

import java.util.HashSet;

/**
 * 同名同年龄的人视为同一个人，只能存储一次，所以需要重写equals和hashcode方法
 */
public class Demo02HashSetToSavePerson {
    public static void main(String[] args) {
        Person person1 = new Person("美美", 11);
        Person person2 = new Person("美美", 12);
        Person person3 = new Person("美美", 11);
        HashSet<Person> set = new HashSet<>();
        set.add(person1);
        set.add(person2);
        set.add(person3);
        System.out.println(set.size());     //没有重写hashcode和equals方法时，2个参数一样的Person对象会被认定为时2个对象
        System.out.println(person1.hashCode());     //1956725890    重写hashcode之后    32393740
        System.out.println(person2.hashCode());     //356573597                         32393741
        System.out.println(person3.hashCode());     //1735600054                        32393740
        System.out.println(person1==person3);       //false     比较的是引用数据类型的地址值
        System.out.println(person1.equals(person3));    //重写前则为false，默认比较的还是引用数据类型的地址值，重写equals方法后为 true 比较的是重写后的属性值
    }
}
