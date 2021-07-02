package com.study.demo01outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件的追加写和换行
 */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        /**
         *  FileOutputStream(String name, boolean append) 创建一个向具有指定 name 的文件中写入数据的输出文件流。
         *  FileOutputStream(File file, boolean append) 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
         *  换行符号:
         *      windows: \r\n
         *      linux:   /n
         *      mac:    /r
         */
//        FileOutputStream fos = new FileOutputStream("day09_IOAndProperties\\c.txt",true);
        FileOutputStream fos = new FileOutputStream(new File("day09_IOAndProperties\\c.txt"),false);
        for (int i = 0; i < 10; i++) {
            fos.write("您好".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
