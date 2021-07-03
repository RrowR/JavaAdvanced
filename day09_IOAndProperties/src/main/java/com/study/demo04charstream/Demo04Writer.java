package com.study.demo04charstream;

import java.io.FileWriter;
import java.io.IOException;

/**
 *   换行
 *   windows : \r\n
 *   linux:    /n
 *   mac:      /r
 */
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day09_IOAndProperties/d.txt",true);
        fw.write("\r\n");
        fw.flush();
        fw.close();
    }
}
