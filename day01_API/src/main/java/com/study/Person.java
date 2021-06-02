package com.study;


import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*
    *   Object的Equals方法默认比较的是地址值，没有意义，所以需要重写equals方法用来比较属性值（name,age）
    * 问题：
    *   隐含一个多态：
    *   Object obj = p2 = new Person("mm",8)
    *   多态的坏处，无法使用子类的方法。但是可以通过向下转型来解决
    * */

    //jdk自带的方法，推荐！！！
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);  //这里用到了Object这个工具类里面的方法
    }

    /*

    //Idea自带的方法
    @Override
    public boolean equals(Object o) {
//        传入的就是自己，返回true
        if (this == o) return true;
        //如果传过来的是空，或者利用反射传过来的不是同一个类型的对象，返回false   getClass 这里用到了反射机制
        if (o == null || getClass() != o.getClass()) return false;
        //如果能走到这一步，则将传过来的对象进行强转
        Person person = (Person) o;

        if (age != person.age) return false;
        return name.equals(person.name);
    }
*/

    /*

    @Override
    public boolean equals(Object o) {
        //这里还有2中情况，当传入的参数类型是一个空和本身的情况
        if(o == null){
            return false;
        }

        //传递过来的就是本身
        if(this == o){          //提高程序效率
            return true;
        }


        //如果传过来的对象是一个Person类型，则进行强转然后比较，如果不是，则直接返回false
        if(o instanceof Person){
            Person p = (Person) o;
            boolean b = this.name.equals(p.name) && this.age == p.age;
            return b;
        }
        return false;

    }

*/
    //    @Override
//    public String toString() {
////        return "ccc";
//        return "name"+name+"age"+age;
//    }
}
