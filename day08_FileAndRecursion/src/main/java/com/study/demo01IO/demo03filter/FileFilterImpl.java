package com.study.demo01IO.demo03filter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()){
            return true;        // 如果是路径是一个文件夹，返回true，将结果放到File[]中去
        }
        return pathname.getName().toLowerCase().endsWith(".java");     // 如果不是一个文件夹，当为 .java 结尾的文件时，输出true 放到File[] 里面去
    }
}
