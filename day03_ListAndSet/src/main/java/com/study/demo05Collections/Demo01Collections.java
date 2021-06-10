package com.study.demo05Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList list1 = demo01addAll();
        System.out.println(list1);
        ArrayList list2 = demo02shuffle(list1);
        System.out.println(list2);
    }

    /**
     * 注意，这里是Collections的方法，不是集合Collection的方法
     * @param list
     * @return
     */
    private static ArrayList demo02shuffle(ArrayList list) {
        Collections.shuffle(list);
        return list;
    }

    private static ArrayList demo01addAll() {
        ArrayList<String> list = new ArrayList<>();
        /**
         * 注意：这里是Collections的方法，不是Collection，所以子类的ArrayList不能调用addAll方法
         */
        Collections.addAll(list,"a","b","c","d","e");
        return list;
    }
}
