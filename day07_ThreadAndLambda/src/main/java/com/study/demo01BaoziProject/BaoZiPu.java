package com.study.demo01BaoziProject;

/**
 * 用来生产包子的包子铺
 */
public class BaoZiPu extends Thread {
    private int count = 0;
    private Baozi bz;

    //创建包子铺的构造方法
    public BaoZiPu(Baozi bz) {
        this.bz = bz;
    }

    /**
     * 用来生产包子的线程方法
     */
    @Override
    public void run() {
        while (true) {
            //如果有包子，则暂停线程
            if (bz.flag == true) {
                synchronized (bz) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                System.out.println("正在制作包子中");
                //这里不能使用wait方法，因为在顾客开始唤醒线程的时候，如果是wait，这个制作包子的线程就会被唤醒，所以只能使用sleep
                Thread.sleep(5000);
                //如果bz锁对象被唤醒，则进行包子的生产，这里的count只是为了让生成的包子有多种而已
                if (count % 2 == 0) {
                    bz.setPi("水晶皮");
                    bz.setXian("猪肉香葱馅");
                } else {
                    bz.setPi("透明皮");
                    bz.setXian("牛肉馅");
                }
                count++;
                bz.flag = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
