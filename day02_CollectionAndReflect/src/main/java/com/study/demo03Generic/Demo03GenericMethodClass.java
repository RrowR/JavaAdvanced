package com.study.demo03Generic;

/**
 * 方法中定义泛型：
 *  修饰符 + 泛型 + 返回值类型 + 方法名 + (泛型 + 引用对象){}
 */
public class Demo03GenericMethodClass {
   public <E> void soutMethod(E e){
       System.out.println(e);
   }

   public static<E> void soutMethod2(E e){
       System.out.println(e);
   }
}
