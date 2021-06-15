package com.study.demo04Exception;

import java.util.Scanner;

public class Demo01RegisterException {
    static String[] usernames = {"镜华","美美","猫羽雫"};
    public static void main(String[] args) /*throws CustomerCompileException*/ {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String next = scanner.next();
//        userRegister(next);
//        userRegister2(next);
        userRegister3(next);
    }

    /**
     * 直接抛出，注册失败不会继续往下执行，流程正确
     * @param name
     * @throws CustomerCompileException
     */
    private static void userRegister(String name) throws CustomerCompileException {
        for (String username : usernames) {
            if (name.equals(username)){
                throw new CustomerCompileException("用户名已经存在");
            }
        }
        System.out.println("注册成功");
    }

    /**
     * 使用trycatch,父类不用抛出异常
     * @param name
     * @throws CustomerCompileException
     */
    private static void userRegister2(String name) {
        for (String username : usernames) {
            if (name.equals(username)){
                try {
                    throw new CustomerCompileException("用户名已经存在");
                } catch (CustomerCompileException e) {
                    e.printStackTrace();
                    return;     //这里return的作用是为了让程序不在继续运行，因为是try/catch，即使出现异常了也会继续运行
                }
            }
        }
        System.out.println("注册成功");
    }

    /**
     * 使用运行时异常，当出现异常时直接中断
     * @param name
     */
    private static void userRegister3(String name) {
        for (String username : usernames) {
            if (name.equals(username)){
                    throw new CustomerRuntimeException("用户名已经存在");
                }
            }
            System.out.println("注册成功");
        }
}
