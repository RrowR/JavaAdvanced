package com.study.Demo05;


/**
 * String的底层代码  private final char value[];  可以看出是一个被final修饰的字符数组
 * 当3个字符串进行相加 "a"+"b"+"c" = "abc"   会产生5个字符串   "a" "b" "c" "ab" "abc" 内存效率极低
 *   StringBuilder的父类AbstractStringBuilder里是一个可变长度的char类型的数组 char[] value;
 *     StringBuilder在使用的过程中容量是16，下次扩容会变成32
 *       在进行字符串相加的时候，会将字符串一次添加到Stiringbuilde中，达到长度便会扩容
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        demo01String();
//        demo02StringBuilder();
    }

    private static void demo02StringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        long time1 = System.currentTimeMillis();
        for (int i = 0; i <10000000 ; i++) {
            String a = "a";
            stringBuilder.append(a);
        }
        long time2 = System.currentTimeMillis();
        System.out.println("花费了："+(time2-time1)+"毫秒");      //使用StringBuilder的append方法速度非常快，及时高2个数量级也远远快于Stirng
    }

    private static void demo01String() {
        String sum = "";
        long time1 = System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            String a = "a";
            sum += a;
        }
        long time2 = System.currentTimeMillis();
        System.out.println("花费了："+(time2-time1)+"毫秒");
    }
}
