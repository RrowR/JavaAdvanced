package com.study.demo01IO.demo02recursion;

import java.io.File;

public class Demo04MultiDiretories {
    public static void main(String[] args) {
        File file = new File("F:\\abc");
        fileRecursive(file);
    }

    private static void fileRecursive(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()){
                fileRecursive(f);
            }else {
                System.out.println(f);
            }
        }
    }
}
