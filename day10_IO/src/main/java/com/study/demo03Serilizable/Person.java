package com.study.demo03Serilizable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 *  这里需要实现Serializable接口，这个接口就是一个标记，没有什么实际作用，但是不在这个对象上打上这个标签将不能把对象写入到文件中
 *  出现异常：Exception in thread "main" java.io.NotSerializableException: com.study.demo03Serilizable.Person
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
    private String name;
    private Integer age;
}
