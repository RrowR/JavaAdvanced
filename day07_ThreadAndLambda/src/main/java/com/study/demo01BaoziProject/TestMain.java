package com.study.demo01BaoziProject;

public class TestMain {
    public static void main(String[] args) {
        Baozi bz = new Baozi();
        new BaoZiPu(bz).start();
        new Customer(bz).start();
    }
}
