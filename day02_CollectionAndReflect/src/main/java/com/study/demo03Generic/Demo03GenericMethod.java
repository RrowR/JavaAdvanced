package com.study.demo03Generic;

/**
 * 测试含有泛型的方法
 */
public class Demo03GenericMethod {
    public static void main(String[] args) {
        Demo03GenericMethodClass dm = new Demo03GenericMethodClass();
        dm.soutMethod(1);
        dm.soutMethod("美美".length());
        dm.soutMethod(true);
        dm.soutMethod(1.2);
        dm.soutMethod2("这是一个静态方法的调用，不推荐创建对象使用");
        Demo03GenericMethodClass.soutMethod2("这是直接通过类来调用方法，推荐使用");
        Demo03GenericMethodClass.soutMethod2("这是直接通过类来调用方法，推荐使用".length());
    }
}
