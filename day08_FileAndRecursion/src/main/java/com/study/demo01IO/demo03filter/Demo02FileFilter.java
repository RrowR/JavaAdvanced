package com.study.demo01IO.demo03filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * File[] listFiles(FileFilter filter)
 *           返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 *                   boolean accept(File pathname)
 *                   测试指定抽象路径名是否应该包含在某个路径名列表中。
 *  File[] listFiles(FilenameFilter filter)
 *           返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 *                   boolean accept(File dir, String name)
 *                   测试指定文件是否应该包含在某一文件列表中。
 *  String[] list(FilenameFilter filter)
 *           返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 */
public class Demo02FileFilter {
    public static void main(String[] args) {
        File file = new File("F:\\abc");
        getAllFiles(file);
    }

    // 这个方法的目的是为了递归除全部文件
    public static void getAllFiles(File file){
        /*File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
            }
        });*/
        // 使用后lambda表达式来优化代码
//        File[] files = file.listFiles((pathname) -> { return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java"); });
        // 重载的方法2       FilenameFilter
        /*File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {      // dir 是传入的目录，name 是每一个文件的名称
                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });*/
        // 使用lambda来进行优化,想要去掉return 就要去掉分号 去掉大括号
        File[] files = file.listFiles((dir,name) -> new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".java"));

        for (File f : files) {
            if (f.isDirectory()){
                getAllFiles(f);
            }else {
                System.out.println(f);
            }
        }
    }
}
