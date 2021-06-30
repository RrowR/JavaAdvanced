package com.study.demo01IO;

/**
 * 使用递归计算1~n之间的和
 *  使用递归效率低下，不推荐使用
 */
public class Demo08CursionSum {
    public static void main(String[] args) {
        int sum = methodSumForCursion(5);
        System.out.println(sum);
    }

    private static int methodSumForCursion(int n) {
        if (n == 1){
            return 1;           // 这里return 1的目的就是为了不让它再去调用自己，所以程序停了下来
        }
        return n + methodSumForCursion(n - 1);      // 5 + 4 + 3 + 2 + 1
    }
}
