package com.study.demo06CulcLambda;

/**
 * lambda表达式带接口带参数的使用
 */
public class Demo01Calculator {
    public static void main(String[] args) {
        sumTwoNumbers(2, 3, new Calculator() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        });

        //使用lambda表达式，主要是对还没有实现方法的接口使用lambda表达式
        sumTwoNumbers(3, 4, (int a, int b) -> {
            return a + b;
        });
    }

    public static void sumTwoNumbers(int a, int b, Calculator calculator) {
        int sum = calculator.add(a, b);
        System.out.println(sum);
    }
}
