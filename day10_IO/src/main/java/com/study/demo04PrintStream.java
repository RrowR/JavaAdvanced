package com.study;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class demo04PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream("day10_IO/打印流.txt");
        printStream.println("这是一个打印流1");
        printStream.println("这是一个打印流2");
        printStream.println("这是一个打印流3");
    }
}
