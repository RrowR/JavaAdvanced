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
        //这里也是，虽然上上面的泛型是一个自定义的I泛型，但是下面在创建对象的时候指定了String类型，当传入的对象不是String类型会报错
        /**
         * Required type: String
         * Provided: int
         */
        Demo04InterfaceGenericImpl2<String> impl2 = new Demo04InterfaceGenericImpl2<>();
        impl2.Method("aaa");
//        impl2.Method(111);
    }
}
