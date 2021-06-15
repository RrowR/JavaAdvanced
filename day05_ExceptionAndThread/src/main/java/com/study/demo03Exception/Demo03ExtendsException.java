package com.study.demo03Exception;

/**
 * 子父类异常之间的关系
 */
public class Demo03ExtendsException {
    public class Fu {
        //子类重写父类方法时，抛出和父类相同的异常
        void method01() throws NullPointerException,ClassCastException{};
        //子类重写父类方法时，抛出父类异常的子类异常
        void method02() throws IndexOutOfBoundsException{};
        //子类重写父类方法时，父类方法不抛出异常，子类抛出时只能进行try/catch
        void method03(){};
        //子类重写父类方法时,父类抛出多个异常，子类需要抛出和父类相同个数的异常（同等级以下），或者不抛出异常
        void method04() throws NullPointerException,ClassCastException{};
    }
    public class Zi extends Fu {
        //抛出相同个数以及类型的异常
        @Override
        void method01() throws NullPointerException, ClassCastException {
            super.method01();
        }

        //抛出对应父类异常的子类异常
        @Override
        void method02() throws ArrayIndexOutOfBoundsException {
            super.method02();
        }

        //子类try/catch父类不用抛出
        @Override
        void method03(){
            try {
                new IndexOutOfBoundsException();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //父类抛出异常，子类不抛出异常
        @Override
        void method04() {
            super.method04();
        }
    }
}
