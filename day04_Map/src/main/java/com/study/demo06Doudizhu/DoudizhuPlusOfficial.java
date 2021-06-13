package com.study.demo06Doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DoudizhuPlusOfficial {
    public static void main(String[] args) {
        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        //定义一个牌库存储所有牌
        HashMap<Integer, String> poker = new HashMap<>();
        //定义一个索引库，其value就是这个poker的key
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        int index = 0;
        pokerIndex.add(index);
        poker.put(index,"大王");
        index++;
        pokerIndex.add(index);
        poker.put(index,"小王");
        index++;
        //这里遍历顺序要注意，通过这种遍历先后顺序可以保证牌从大到小
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;                  //这里如果不进行index++的话，这里会一直被<2,XX>给替代，最终被<2,♦3>替代
            }
        }
        Collections.shuffle(pokerIndex);
//        System.out.println(pokerIndex);     //这里面打印的是value
        //定义4个集合，里面存储牌的索引
        ArrayList<Integer> user1 = new ArrayList<>();
        ArrayList<Integer> user2 = new ArrayList<>();
        ArrayList<Integer> user3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        /**
         * 这里是根据索引来进行遍历
         */
        for (Integer integer : pokerIndex) {
            if (integer > 50){
                dipai.add(pokerIndex.get(integer));
            }else if (integer %3 == 0){
                user1.add(pokerIndex.get(integer));
            }else if (integer %3 == 1){
                user2.add(pokerIndex.get(integer));
            }else if (integer %3 == 2){
                user3.add(pokerIndex.get(integer));
            }
        }

        /**
         * 这里洗牌是默认是从小到大，根据value来进行排序，并且value值在HashMap中对应的值就是从小到大对应
         */
        Collections.sort(user1);
        Collections.sort(user2);
        Collections.sort(user3);
        Collections.sort(dipai);

        /**
         * 调用看牌的方法
         */
        watchPoker("user1",poker,user1);
        watchPoker("user2",poker,user2);
        watchPoker("user3",poker,user3);
        watchPoker("底牌",poker,dipai);

    }

    /**
     * @param name  传入名字
     * @param poker 牌库
     * @param list  每个用户的索引库，其value就是HashMap牌哭中的key
     */
    private static void watchPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list) {
        System.out.print("用户为:"+name+" ");
        for (Integer integer : list) {
            String value = poker.get(integer);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
