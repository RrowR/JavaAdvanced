package com.study.demo01IO.demo01file;

import java.io.File;

/**
 * public boolean exists() ：此File表示的文件或目录是否实际存在。
 * public boolean isDirectory() ：此File表示的是否为目录。
 * public boolean isFile() ：此File表示的是否为文件。
 *
 * 这里都是对File的构造方法进行判断
 */
public class Demo04Judge {
    public static void main(String[] args) {
        method01();
//        method02();
//        method03();
    }

    private static void method03() {
        // 判断是否是一个文件
        File file = new File("E:\\javaAdvanced\\a\\a.txt");
        File file2 = new File("E:\\javaAdvanced\\a");
        boolean b = file2.isFile();
        System.out.println(b);
    }

    private static void method02() {
        // 判断是否是一个目录
        File file = new File("E:\\javaAdvanced\\a\\a.txt");
        File file2 = new File("E:\\javaAdvanced\\a");
        boolean b = file2.isDirectory();
        System.out.println(b);
    }

    private static void method01() {
        // 判断文件或者文件夹是否存在
        File file = new File("E:\\javaAdvanced\\a\\a.txt");
        File file2 = new File("E:\\javaAdvanced\\a");
        File file3 = new File("E:\\javaAdvanced\\c");
        // 相对路径也可以      path from respository root 才可以 必须是相对于项目的根目录下才可以，根目录下的路径要完整
        File file4 = new File("day08_FileAndRecursion/src/main/java/com/study/demo01IO/Demo03FileUsuallyMethod.java");
        boolean b = file4.exists();
        System.out.println(b);
    }
}
