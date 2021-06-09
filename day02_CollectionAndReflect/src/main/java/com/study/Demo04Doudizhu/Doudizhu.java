package com.study.Demo04Doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class Doudizhu {
    public static void main(String[] args) {
        //定义所有牌
        String huase[] = {"梅花","方块","红桃","黑桃"};
        Object paishu[] = {2,3,4,5,6,7,8,9,10,"J","Q","K","A"};
        String daxiaowang[] = {"queen","king"};
        ArrayList<Object> allPapers = new ArrayList<>();
        allPapers.add(daxiaowang[0]);
        allPapers.add(daxiaowang[1]);
        //讲定义的牌添加到ArrayList集合中
        for (String s : huase) {
            for (Object o : paishu) {
//                System.out.println(s+o);
                allPapers.add(s+o);
            }
        }
        //将ArrayList里的牌顺序打乱
        Collections.shuffle(allPapers);
        //将54张牌中的51张牌发到3个人的手中，并且最后的3张牌作为底牌
        ArrayList<Object> user1 = new ArrayList<>();
        ArrayList<Object> user2 = new ArrayList<>();
        ArrayList<Object> user3 = new ArrayList<>();
        ArrayList<Object> dipai = new ArrayList<>();
        for (int i = 0; i <= allPapers.size()-1;i++){
            if (i >= 51){
                dipai.add(allPapers.get(i));
            } else if(i%3==0){
                user1.add(allPapers.get(i));
            }else if (i%3==1){
                user2.add(allPapers.get(i));
            }else if (i%3==2){
                user3.add(allPapers.get(i));
            }
        }

        //看牌
        System.out.println("user1"+user1);
        System.out.println("user2"+user2);
        System.out.println("user3"+user3);
        System.out.println("dipai"+dipai);

    }
}
