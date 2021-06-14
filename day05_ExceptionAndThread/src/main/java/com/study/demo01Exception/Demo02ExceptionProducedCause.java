package com.study.demo01Exception;

/**
 * 异常产生的原因，如何产生的，见有道云day05/p03
 */
public class Demo02ExceptionProducedCause {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        getElement(arr,3);
    }

    private static int getElement(int[] arr,int index) {
        int result = arr[index];
        return result;
    }
}
