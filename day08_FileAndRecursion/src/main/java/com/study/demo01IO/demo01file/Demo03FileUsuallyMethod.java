package com.study.demo01IO.demo01file;

import java.io.File;

/**
 *  public String getAbsolutePath() ` ：返回此File的绝对路径名字符串。
 *  public String getPath() ` ：将此File转换为路径名字符串。
 *  public String getName()`  ：返回由此File表示的文件或目录的名称。
 *  public long length()`  ：返回由此File表示的文件的长度。
 */
public class Demo03FileUsuallyMethod {
    public static void main(String[] args) {
//        method01();
//        method02();
//        method03();
        method04();
    }

    private static void method04() {
        // 构造方法指向的文件大小(单位字节) 文件夹是没有大小概念的
        File file = new File("E:\\javaAdvanced\\a\\a.txt");
        File file2 = new File("E:\\javaAdvanced\\a");
        long length = file2.length();
        System.out.println(length);     // 返回这个路径里文件的大小
    }

    private static void method03() {
        File file = new File("E:\\javaAdvanced\\a.txt");
        File file2 = new File("E:\\javaAdvanced");
        String name = file.getName();
        System.out.println(name);       // 返回这个路径里的文件名称或者文件夹
    }

    private static void method02() {
        File file = new File("E:\\javaAdvanced\\a.txt");
        String path = file.getPath();
        System.out.println(path);       // E:\javaAdvanced\a.txt 返回一个String类型的路径
    }

    private static void method01() {
        // 如果传入相对路径，那么返回的就是这个项目下的绝对路径
        // 如果传入的是绝对路径，返回的就是传入的绝对路径
        File file = new File("a.txt");
        File absoluteFile = file.getAbsoluteFile();
        System.out.println(absoluteFile);       // C:\Users\Atlantis\Documents\Ideaspace\JavaAdvanced\a.txt
    }
}
