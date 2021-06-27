package com.study.demo01IO;

import java.io.File;

/**
 * 绝对路径：不提
 * 相对路径：相对于我这个maven的root下的路径 C:\Users\Atlantis\Documents\Ideaspace\JavaAdvanced
 * 此时的路径就是在这个路径的基础之上  ...\a.txt
 * 注意：
 *      1.路径不区分大小写
 *      2.Windows上使用的是\反斜杠，\ 是一个转义字符，\\代表一个普通的\
 */
/*  构造方法 File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
    String pathname参数
        1.可以是以文件结尾
        2.可以是相对/绝对路径
        3.路径可以是存在的，也可以是不存在的
        4.创建File对象，只是把字符串封装成File对象，不考虑路劲的真假情况
*/
public class Demo02File {
    public static void main(String[] args) {
//        method01();
//        method02("E:\\javaAdvanced\\","a.txt");
        method03();
    }

    // 构造方法 File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
    // 注意：这里是File parent
    // 通过先创建 File parent 类 然后再进行组合
    private static void method03() {
        File parent = new File("E:\\javaAdvanced\\");
        File file = new File(parent, "a.txt");
        System.out.println(file);

    }

    // 构造方法 File(String parent, String child)  根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
    // 单独书写，使用起来灵活，父路径和子路径都可以变化
    // 这里是String parent
    private static void method02(String parent,String child) {
        File file = new File(parent, child);
        System.out.println(file);       //E:\javaAdvanced\a.txt
    }

    private static void method01() {
        // 绝对路径，相对路径，文件夹都行
        File file = new File("E:\\javaAdvanced\\a.txt");
        System.out.println(file);       // E:\javaAdvanced\a.txt
        File file2 = new File("a.txt");
        System.out.println(file2);      // a.txt
        File file3 = new File("E:\\javaAdvanced");
        System.out.println(file3);      // E:\javaAdvanced
    }
}
