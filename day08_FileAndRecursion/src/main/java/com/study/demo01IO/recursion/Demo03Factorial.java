package com.study.demo01IO.recursion;

/**
 * 使用递归实现阶乘
 */
public class Demo03Factorial {
    public static void main(String[] args) {
        int factorial = factorial(4);
        System.out.println(factorial);
    }

    public static int factorial(int n){
        if (n == 1){
            return 1;       // 结束条件：不再自己调用自己
        }
        return n * factorial(n - 1);    // 这里的返回值必须是调用自己的方法才行
    }
}
