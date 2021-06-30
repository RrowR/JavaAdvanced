package com.study.demo01IO.demo02recursion;

/**
 * 递归：自己调用自己
 *      注意：
 *          1.递归一定要终止自己的方法
 *          2.递归次数不能太多，否则会造成栈溢出     Exception in thread "main" java.lang.StackOverflowError
 *      a() 方法会一直调用a方法，在栈内存中越来越多，导致栈内存溢出
 *      构造方法禁止递归
 */
public class Demo01Recursion {
    public static void main(String[] args) {
//        a();
        b(1);       // 11250 的时候，程序出现异常
    }

    /**
     * 编译报错，禁止递归
     */
    public Demo01Recursion() {
//        Demo07Recursion();
    }

    private static void b(int i) {
        System.out.println(i);
        if (i == 20000){
            return;
        }
        b(++i);     // 这里不能使用 i++ 不然传入的值一直是1
    }

    public static void a() {
        System.out.println("自己调用自己");
        a();
    }
}

