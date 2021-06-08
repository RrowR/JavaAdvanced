package com.study.demo03Generic;

/**
 * 自定义接口泛型和实现的泛型的方法
 * @param <I>
 */
public class Demo04InterfaceGenericImpl2<I> implements Demo04InterfaceGeneric<I>{

    @Override
    public void Method(I i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Demo04InterfaceGenericImpl2<String> impl2 = new Demo04InterfaceGenericImpl2<>();
        impl2.Method("aaa");
    }
}
