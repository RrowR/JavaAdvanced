package com.study.demo02ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * java.lang.Object
 * java.util.concurrent.Executors
 *      static ExecutorService newFixedThreadPool(int nThreads)
 *      创建一个线程池，该线程池重用固定数量的从共享无界队列中运行的线程。
 *   参数：线程的数量
 *   返回值：java.util.concurrent 下的 Interface ExecutorService 是一个接口类型(面向接口编程)
 *   Interface ExecutorService 是一个线程池接口:
 *          用来从线程池中获取线程,调用start方法,执行线程任务
 *              Future<?> submit(Runnable task)
 *              提交一个 Runnable 任务用于执行，并返回一个表示该任务的 Future
 *          关闭线程：
 *              void shutdown()
 *              启动一次顺序关闭，执行以前提交的任务，但不接受新任务。
 *     1.调用Executors里的 newFixedThreadPool(int n) 方法，并设置线程个数，将它的返回值用父类的接口来接收
 *     2.创建一个已经实现多线程的类
 *     3.调用这个接口实现类里的 Future<?> submit(Runnable task) 方法，提交已经实现run方法的类
 *     4.可以使用shutdown来关闭线程池，十分不建议使用
 *
 */
public class Demo01ThreadPool {
    public static void main(String[] args) {
        //创建了2个线程的线程池，并用接口来接收这个实现类
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //创建一个实现类run方法的实现类，不过这里不是实现Runable接口，而是继承了Thread类来实现的，不过本质还是实现了Runable接口
        ThreadClassImpl t1 = new ThreadClassImpl();
        //这是一个实现了Runable接口的线程
        ThreadRunableImpl t2 = new ThreadRunableImpl();
        /*executorService.submit(t1);
        executorService.submit(t1);
        executorService.submit(t1);*/
        executorService.submit(t2);
        executorService.submit(t2);
        executorService.submit(t2);
        /*
            这里是线程执行完一次就放回去，再去调用下一个线程去执行(可能下次还是同一个线程)
            pool-1-thread-1线程执行了
            pool-1-thread-2线程执行了
            pool-1-thread-1线程执行了
        */
        //到这里程序并不会进行，如果不销毁线程的话,但是这里不建议销毁线程
        executorService.shutdown();
    }
}
