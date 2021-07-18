package com.study.demo03Serilizable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 *  这里需要实现Serializable接口，这个接口就是一个标记，没有什么实际作用，但是不在这个对象上打上这个标签将不能把对象写入到文件中
 *  出现异常：Exception in thread "main" java.io.NotSerializableException: com.study.demo03Serilizable.Person
 */

/*
    瞬态关键字 transient
    和 static 关键字差不多，序列化的是一个对象，当对象的某个属性被修饰为静态的时候，静态属性优先加载，那么这个对象的静态属性序列化就会失败
    Person(name=咚咚, age=null) 静态成员属性 Integer age 结果会为null
    transient 的作用就是既不希望他是静态的，也不希望这个静态对象的属性被序列化，那么就可以使用这个关键字
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
    private String name;
    private transient Integer age;
}
