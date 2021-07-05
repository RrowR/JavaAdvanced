package com.study.demo01BufferedStream;


import java.io.*;

/**
 * 可以看到使用Buffer速度会明显优于不使用Buffer
 */
public class Demo03BufferedFileCopySpeedTest {
    public static void main(String[] args) throws IOException {
        method02();
//        method01();

    }

    private static void method02() throws IOException {
        long s = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day10_IO/nekohashuzuku.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10_IO/character.png"));
        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes);
        }
        bos.close();
        bis.close();
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }

    private static void method01() throws IOException {
        long s = System.currentTimeMillis();
        File file = new File("day10_IO/nekohashuzuku.png");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(new File("day10_IO/character.png"));
        byte[] bytes = new byte[1024];
        // int len = fis.read(bytes);       这里千万不能这样写，这样只会读取一次，并且len = 1024; 在while循环里的len一直为1024
        int len;
        while ((len = fis.read(bytes)) != -1){      // 如果像上面的那种方式 那么 1024 != -1 会一直成立 那么 byte里就只会是 一开始 字节数组里的1024的内容，我们需要让fis.read都要一直执行
//            System.out.println(len);
//            fos.write(bytes);
            fos.write(bytes,0,len);       // 优化一下代码,当长度不够的时候，不让它把剩余的空也写进去，不过测试上面结果并不影响
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }
}
