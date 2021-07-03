package com.study.demo04charstream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 异常处理，当输出文件出现异常的时候，直接打印异常，对出现的异常进行处理
 */
public class Demo05ExceptionHandler {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("day09_IOAndProperties/sss/e.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("hello world"+i+"\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();        // 当出现异常的时候，会直接捕获异常 java.io.FileNotFoundException: day09_IOAndProperties\sss\d.txt (系统找不到指定的路径。)
        } finally {
            if (fw != null){
                try {
                    // 当创建FileWriter失败了，那么这个对象就会为空，会报空指针异常，我们需要在上面再加一条判断
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();            // Exception in thread "main" java.lang.NullPointerException
                }
            }
        }


    }
}
