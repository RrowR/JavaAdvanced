package com.study.demo04PrintStream;


import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    printstream虽然不会报IO异常，但是还是会报FileNotFoundException
 */
public class Demo01PrintStream {
    @Test
    void method01() throws FileNotFoundException {
        /*
            printstream虽然不会报IO异常，但是还是会报FileNotFoundException
            注意：
                如果是 @Test 环境下 相对路径从day10_IO开始   打印流.txt
                在main环境下，相对路径从javaAdvanced开始    day10_IO/打印流.txt
        */
        PrintStream printStream = new PrintStream("打印流.txt");
        printStream.print((char) 98);
        printStream.close();
    }

    @Test
    void method02() throws FileNotFoundException {
        /*
            java.lang.Object
                继承者 java.lang.System
            static void setOut(PrintStream out) 重新分配“标准”输出流。
         */
        PrintStream ps = new PrintStream("这是改变的输出流.txt");
        // 将从控制台输出变成从指定的打印流目的地输出
        System.setOut(ps);
        System.out.println("我是被改变的打印流目的地的内容！！！");
    }
}
