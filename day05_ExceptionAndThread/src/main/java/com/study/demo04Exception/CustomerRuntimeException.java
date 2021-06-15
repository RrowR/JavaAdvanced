package com.study.demo04Exception;

public class CustomerRuntimeException extends RuntimeException {
    public CustomerRuntimeException() {
        /** 父类无参构造
         public Exception() {
         super();
         }*/
        super();
    }

    public CustomerRuntimeException(String message) {
        /** 父类有参后遭
         public Exception(String message) {
         super(message);
         }*/
        super(message);
    }
}
