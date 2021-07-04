package com.study.demo04charstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK7处理异常，可以将流对象的定义放到try的括号中去，可以不需要手动地去关闭流
 */
public class Demo06ExceptionHandlerInJDK7 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("day09_IOAndProperties/nekohashuzuku.png");
            FileOutputStream fos = new FileOutputStream("day09_IOAndProperties/character.png")) {
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
