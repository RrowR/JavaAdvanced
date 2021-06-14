package com.study.demo01Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo05Throws {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        /**
         * 方法声明了异常，那么调用此方法的调用者也要进行声明，并且有多少就要声明多少
         * 方法的调用者如果也是将异常进行抛出，那么在这个方法出现异常之后，程序会被终止而不会继续进行下去
         */
//        fileupload("E:\\a.txt");
        fileupload("E:\\a.txta");
    }

    /**
     * @param file
     * @throws FileNotFoundException    子类
     * @throws IOException  父类
     */
    private static void fileupload(String file) throws /*FileNotFoundException,*/IOException{
        String filepath = "E:\\a.txt";
        if (!file.equals(filepath)){
            throw new FileNotFoundException("文件没有找到异常");        //这是一个编译时的异常，需要被处理
        }
        if (!file.endsWith(".txt")){
            throw new IOException("文件后缀名不对");
        }
        System.out.println("文件路径匹配");


    }
}
