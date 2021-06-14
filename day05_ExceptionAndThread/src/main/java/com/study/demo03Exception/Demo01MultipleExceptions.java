package com.study.demo03Exception;


import java.util.List;

/**
 * 异常处理的三种方式：
 *  1.分别捕获
 *  2.一个try多个catch,子类异常要在上面
 *  3.直接使用最大异常来捕获
 */
public class Demo01MultipleExceptions {
    public static void main(String[] args) {
//        togetherTryCatch();
//        oneTryTwoCatch();
        catchMaxException();
    }

    /**
     * 直接用最大异常来捕获多个try
     */
    private static void catchMaxException() {
        int[] arr = {1,2,3};
        List<Integer> list = List.of(1, 2, 3);
        try {
            int i = arr[3];     //ArrayIndexOutOfBoundsException
//            list.get(3);        //IndexOutOfBoundsException
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 一个try多个Catch
     * 注意：
     *      子类的catch要在上面，不然会报错
     */
    private static void oneTryTwoCatch() {
        int[] arr = {1,2,3};
        List<Integer> list = List.of(1, 2, 3);
        try {
            int i = arr[3];     //ArrayIndexOutOfBoundsException
            list.get(3);        //IndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    /**
     * 每个异常分别进行Try/Catch
     */
    private static void togetherTryCatch() {
        int[] arr = {1,2,3};
        List<Integer> list = List.of(1, 2, 3);
        try {
            int i = arr[3];     //ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        try {
            list.get(3);        //IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
