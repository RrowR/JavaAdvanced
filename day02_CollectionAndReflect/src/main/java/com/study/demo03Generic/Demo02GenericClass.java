package com.study.demo03Generic;

import lombok.Data;

/**
 * 类泛型的定义，凡是返回值的地方全部使用E,并且在类上也定义一个<E>用来接收传过来的泛型
 * @param <E>
 */
@Data
public class Demo02GenericClass<E> {
    private E name;
}
