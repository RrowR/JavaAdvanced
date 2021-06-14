package com.study.demo02Exception;

import java.io.IOException;

/**
 * 使用try/Catch的目的就是不让程序出问题时停下来，因为如果直接抛出的话，程序会被JVM中断
 * 其中catch可以有多个
 *  try{
 *      可能产生异常的代码
 *  }catch(异常类名 变量名){
 *      异常的处理逻辑
 *  }...catch(){}
 *  注意：
 *      1.一个try可以对应多个catch
 *      2.当try中出现异常才会去执行catch代码，然后继续执行后面的代码。当try中没有出现异常，则不会执行catch中的代码，而直接继续执行后面的代码
 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        readFile("E:\\a.sss");
        System.out.println("后续代码");
    }

    private static void readFile(String filepath) {
        String file = "E:\\a.txt";
        if (!file.equals(filepath)){
            try {
                throw new IOException("文件名不匹配");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("方法里的后续代码");
    }
}
