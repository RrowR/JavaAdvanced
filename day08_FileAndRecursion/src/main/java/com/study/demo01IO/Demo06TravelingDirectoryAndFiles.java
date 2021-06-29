package com.study.demo01IO;

import java.io.File;

/**
 * java.lang.Object
 *  继承者 java.io.File
 *      public String[] list()` ：返回一个String数组，表示该File目录中的所有子文件或目录
 *      public File[] listFiles()` ：返回一个File数组，表示该File目录中的所有的子文件或目录
 */
public class Demo06TravelingDirectoryAndFiles {
    public static void main(String[] args) {
//        method01();
        method02();
    }

    private static void method01() {
        // public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录
        // 这里并不会返回下一级目录,每个对象路径都是以String类型来返回
        // 这里使用 / 或者 \\ 都可以来表示路径
        // 文件必须是一个文件夹，当是文件的时候会报错
        File file = new File("day08_FileAndRecursion\\a\\b\\c\\d\\e\\c.txt");       // Exception in thread "main" java.lang.NullPointerException
        // 当查询的是项目的root目录的时候，不能使用相对路径
        File file2 = new File("C:\\Users\\Atlantis\\Documents\\Ideaspace\\JavaAdvanced");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void method02(){
        // public File[] listFiles()` ：返回一个File数组，表示该File目录中的所有的子文件或目录
        // 隐藏文件也可以显示        day08_FileAndRecursion\a\b\c\d\e\hide.txt
        File file = new File("day08_FileAndRecursion/a/b/c/d/e");
        File[] files = file.listFiles();
        for (File f : files) {
            // 这里是返回的文件的相对路径
            System.out.println(f);
        }
    }
}
