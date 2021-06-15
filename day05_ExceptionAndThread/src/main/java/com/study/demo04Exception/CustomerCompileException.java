package com.study.demo04Exception;

public class CustomerCompileException extends Exception {
    public CustomerCompileException() {
       /** 父类无参构造
            public Exception() {
                super();
            }*/
        super();
    }

    public CustomerCompileException(String message) {
            /** 父类有参后遭
             public Exception(String message) {
                super(message);
            }*/
        super(message);
    }
}
