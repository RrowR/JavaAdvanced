package com.study.demo02CustomerMapParameter;

import java.util.HashMap;

public class Demo01MapCustomerParameter {
    public static void main(String[] args) {
//        demo01();
        demo02();
    }

    /**
     * 当Person没有重写equals和hashcode方法的时候，不能保证person唯一，当只有重写了equals方法，才能保证唯一性
     */
    private static void demo02() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("jh",11),"japen");
        map.put(new Person("mm",9),"japen");
        map.put(new Person("猫羽雫",16),"japen");
        map.put(new Person("jh",11),"china");
        System.out.println(map);
    }

    private static void demo01() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("jh",10);
        map.put("mm",9);
        map.put("猫羽雫",16);
        map.put("jh",11);
        //由于String默认重写了equals和Hashcode方法，所以保证了key值唯一，同一个key值所对应的value会取代前面key值的value
        System.out.println(map);        //{mm=9, 猫羽雫=16, jh=11}
    }
}
