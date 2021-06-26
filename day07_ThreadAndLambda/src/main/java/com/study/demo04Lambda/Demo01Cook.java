package com.study.demo04Lambda;

public class Demo01Cook {
    public static void main(String[] args) {
        //最开始的方式1：调用方法，实现匿名内部接口的方法
        method01(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了1");
            }
        });

        //使用lambda表达式
        /**
         * 1.方法里需要有方法(这里是接口)
         * 2.() 就是这个 接口未实现的空参方法
         * 3. -> {使用箭头来指向这个空参方法的方法体}
         */
        method01(() -> {
            System.out.println("吃饭了2");
        });

        method01(() -> System.out.println("吃饭了2"));
    }

    //在定义的方法里传入接口，并调用接口里的方法
    private static void method01(Cook cook) {
        cook.makeFood();
    }
}
