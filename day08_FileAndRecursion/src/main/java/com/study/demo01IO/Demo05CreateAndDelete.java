package com.study.demo01IO;

import java.io.File;
import java.io.IOException;

/**
 * ### 创建删除功能的方法
 *
 *  public boolean createNewFile()` ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
 *  public boolean delete()` ：删除由此File表示的文件或目录。
 *  public boolean mkdir()` ：创建由此File表示的目录。
 *  public boolean mkdirs()` ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 */
public class Demo05CreateAndDelete {
    public static void main(String[] args) throws IOException {
        createFileMethod();
//        deleteFileMethod();
//        mkdirFileMethod();
//        mkdirsFileMethod();
    }

    private static void mkdirsFileMethod() {
        File file = new File("F:\\a\\b\\c\\d");
        File file2 = new File("day08_FileAndRecursion\\a\\b\\c\\d\\e\\a.txt");      // 这里是创建文件夹
        boolean b = file2.mkdirs();
        System.out.println(b);
    }

    private static void mkdirFileMethod() {
//        File file = new File("F:\\a\\b");
        File file2 = new File("day08_FileAndRecursion\\a\\b\\c\\d\\e\\a.txt\\b.txt");       // 这里也是创建文件夹
        boolean b = file2.mkdir();       // 创建单级文件夹
        System.out.println(b);
    }

    private static void deleteFileMethod() {
        File file = new File("F:\\a");
        boolean b = file.delete();      // 这里默认不能递归删除
        System.out.println(b);

    }

    private static void createFileMethod() throws IOException {
        File file = new File("F:\\a.txt");
        File file2 = new File("day08_FileAndRecursion\\a\\b\\c\\d\\e\\a.txt\\b.txt\\c.txt");        // 这里才是创建文件
        boolean b = file2.createNewFile();
        System.out.println(b);
    }
}
