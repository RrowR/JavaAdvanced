package com.study.demo05Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * java.lang.Object
 *  java.util.Collections
 *   此类仅由静态方法组合或返回集合。 它包含对集合进行操作的多态算法
 *      static <T> void sort(List<T> list, Comparator<? super T> c) 根据指定的比较器引起的顺序对指定的列表进行排序。
 *      使用这个方法的好处是不用实现Comparable<E>接口，不过需要传入一个集合并且传入一个比较器
 */
public class Demo03Sort {
    public static void main(String[] args) {
//        demo01();
        demo02SortByStudents();


    }

    private static void demo01() {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,2,3,1,5);
        System.out.println(list);
        //传入集合，并且传入一个比较器，不需要实现Comparable接口，但是这个Integer已经默认实现了这个接口了
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;     //左减右为升序
            }
        });
        System.out.println(list);
    }

    private static void demo02SortByStudents() {
        ArrayList<Student> students = new ArrayList<>();
        Student p1 = new Student("a镜华", 10);
        Student p2 = new Student("c美美", 9);
        Student p3 = new Student("d猫羽雫", 14);
        Student p4 = new Student("bnya", 14);
        Collections.addAll(students,p1,p2,p3,p4);
        System.out.println(students);
/*      //根据年龄进行排序
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();     //根据年龄进行升序
                return o2.getAge() - o1.getAge();       //根据年龄进行降序
            }
        });*/
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();         //如果年龄相等
                if(result == 0){
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);       //则判断名字的首字母
                }
               return result;
            }
        });
        System.out.println(students);
    }
}
