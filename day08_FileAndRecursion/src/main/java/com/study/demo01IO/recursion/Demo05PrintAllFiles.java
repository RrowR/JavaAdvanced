package com.study.demo01IO.recursion;

import java.io.File;

/**
 * 打印文件夹下的目录以及文件的方法
 */
public class Demo05PrintAllFiles {
    public static void main(String[] args) {
        File file = new File("F:\\abc");
        getAllFiles(file);
    }

    private static void getAllFiles(File dir) {
        File[] files = dir.listFiles();
        for (File f : files) {      // 这里是先获得每个文件的路径f
            if (f.isDirectory()) {      // 然后再进行判断这个文件是否是一个文件夹
                System.out.println(f);
                getAllFiles(f);      // 如果是一个文件夹，则继续调用自己,注意这里是子文件f，不是一开始的路径file
            } else {
                System.out.println(f);      // 不是文件夹则输出文件
            }
        }
    }
}
