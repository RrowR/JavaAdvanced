package com.study.demo03LinkedHashMap;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 统计输入的字母个数：
 *  思路：使用HashMap中Key唯一Value不唯一的特性，将字母存在key中，将统计的个数存在Value中
 */
public class Demo02CountLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入阿拉伯字母来统计字母个数");
        String next = scanner.next();
        System.out.println(next);
        HashMap<Character, Integer> map = new HashMap<>();
        //将输入的字符转换成字符数组
        char[] chars = next.toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
