package com.study.demo01Exception;

import java.util.Objects;

/**
 * java.lang.Object
 *  java.util.Objects
 *      static <T> T requireNonNull(T obj) 检查指定的对象引用不是 null 。
 *      static <T> T requireNonNull(T obj, String message) 检查指定的对象引用不是null并抛出自定义的NullPointerException（如果是）。
 */
public class Demo04Objects {
    public static void main(String[] args) {
        method01(null);
    }
    public static void method01(Object obj){
        /*if (obj == null){
            throw new NullPointerException("传递过来的对象为空");
        }*/
        /**
         * 可是直接调用utils包下的Objects内的静态方法来进行判断
         *     public static <T> T requireNonNull(T obj) {
         *         if (obj == null)
         *             throw new NullPointerException();
         *         return obj;
         *     }
         *
     *         public static <T> T requireNonNull(T obj, String message) {
         *         if (obj == null)
         *             throw new NullPointerException(message);
         *         return obj;
         *     }
         */
//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传入的对象内容为空");

    }

}
