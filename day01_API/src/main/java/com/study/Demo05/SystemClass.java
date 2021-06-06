package com.study.Demo05;

import java.util.Arrays;

/**
 * Class System
 * java.lang.Object
 *  java.lang.System
 *
 *  public static long currentTimeMillis()返回当前时间（以毫秒为单位）        一般在程序执行前执行一次，程序执行后再执行一次，最后可以计算出程序的执行时间
 *  public static void arraycopy(Object src,
 *                              int srcPos,
 *                              Object dest,
 *                              int destPos,
 *                              int length)将指定源数组中的数组从指定位置复制到目标数组的指定位置。
 *   参数
 *      src - 源数组。
 *      srcPos - 源数组中的起始位置。
 *      dest - 目标数组。
 *      destPos - 目的地数据中的起始位置。
 *      length - 要复制的数组元素的数量。
 */
public class SystemClass {
    public static void main(String[] args) {
//        SystemcurrentTimeMillis();
        Systemarraycopy();
    }

    private static void Systemarraycopy() {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        System.arraycopy(arr,2,arr2,3,2);
        System.out.println(Arrays.toString(arr2));  //可以使用Arrays.toString来将数组中的数据进行打印，不然就是地址值
    }

    private static void SystemcurrentTimeMillis() {
        long l = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long l2 = System.currentTimeMillis();
        System.out.println("程序共耗时:"+(l2-l)+"毫秒");
    }
}
