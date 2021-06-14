package com.study.demo01Exception;

/**
 * 运行时异常我们可以不用处理，全权交给JVM，因为虚拟机会告诉我们哪里出现了异常
 * 编译时异常我们必须处理，如果不进行处理，程序将无法运行
 * 一个程序出现了异常，程序将会被中断，不会继续往下执行
 */
public class Demo03Throw {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr2 = null;
        System.out.println(getElements(arr2, 3));
    }

    private static int getElements(int[] arr,int index) {
        if (arr == null){
            throw new NullPointerException("出现了空指针异常");
        }
        if (index < 0 || index > arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组索引越界异常");
        }
        return arr[index];
    }
}
