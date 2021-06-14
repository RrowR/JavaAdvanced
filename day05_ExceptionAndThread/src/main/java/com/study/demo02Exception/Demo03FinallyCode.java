package com.study.demo02Exception;

import java.io.IOException;

/**
 * finally代码块的作用:
 *      当程序可能出现异常的时候，我们希望程序能继续执行，因为如果放在try里，那么出现异常的那个位置的后半段就不会再继续执行了
 *      所以我们需要将一定要执行的代码放到finally中，保证想运行的那段代码能继续运行
*    注意：
 *    1.finally不能单独使用，必须和try一起使用
 *    2.finally一般用于资源的释放
 */
public class Demo03FinallyCode {
    public static void main(String[] args) {
        try {
            readFile("E:\\a.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("资源释放");
        }
    }
    private static void readFile(String filepath) throws IOException {
        String file = "E:\\a.txt";
        if (!file.endsWith(filepath)){
            throw new IOException("文件的后缀名不对");
        }
//        System.out.println("后续代码");
    }
}
