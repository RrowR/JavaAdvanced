package com.study.demo04VarArgs;

/**
 * 可变参数：是JDK1.5之后出现的新特性
 * 使用前提：
 *      当方法的参数列表数据类型已经确定 ,但是参数的个数不确定，就可以使用可变参数
 *  使用格式:定义方法的时候使用
 *      修饰符 返回值类型 方法名（数据类型...变量名）{}
 *  可变参数的原理：
 *      可变参数底层就是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些数据
 *      传递的参数个数，可以是0个，也可以是1，2，3个等等
 */
public class Demo01VarArgs {
    public static void main(String[] args) {
//        method01(1,2,3,4);
//        method02("mm",1.2,5,4,3,2,1);
        int sum = method03(1, 2, 3, 4, 5);
        System.out.println(sum);

    }

    //因为底层是一个可变的数组，可以使用增强for循环
    private static int method03(int...a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    //可变长度的数组必需放在最后面,并且只能有且只有一个可变参数
    private static int method02(String s,double b,int...i) {
        System.out.println(s);
        System.out.println(b);
        System.out.println(i);
        System.out.println(i.length);
        return 0;

    }

    //传入的参数是一个可变参数,底层是一个可变长度的数组
    private static int method01(int...a) {
        System.out.println(a);
        System.out.println(a.length);
        return 0;
    }
}
