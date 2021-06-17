package com.study.threadSetName;

/**
 * java.lang.Object
 *     继承者 java.lang.Thread
 *     1.void setName(String name) 改变线程名称，使之与参数 name 相同。
 *     2.Thread(String name) 分配新的 Thread 对象。
 */
public class ThreadClass extends Thread{
    public ThreadClass() {}

    /**
     * @param name  这个参数是用来传入父类的构造方法从而来设置线程名字
     */
    public ThreadClass(String name) {
        super(name);
    }

    @Override
    public void run() {
        //这里获取的是这个ThreadClass里的线程，可以通过调用父类的setname或者调用父类的构造方法来进行修改
        System.out.println(Thread.currentThread().getName());
    }
}
