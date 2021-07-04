package com.study.demo04charstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK9的新特性，可以在try的()把流对象的引用丢进去，也可以不用手动释放
 */
public class Demo06ExceptionHandlerInJDK9 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("day09_IOAndProperties/nekohashuzuku.png");
        FileOutputStream fos = new FileOutputStream("day09_IOAndProperties/character.png");

        try(fis;fos) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1){
                fos.write(bytes);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
