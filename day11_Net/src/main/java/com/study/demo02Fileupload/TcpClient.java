package com.study.demo02Fileupload;

import java.io.*;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        // 定义一个自己的输入流来读取要上传的文件
        FileInputStream fis = new FileInputStream("day11_Net/nekohashuzuku.png");
        Socket socket = new Socket("127.0.0.1", 8888);
        /*
            获取 socket 里的 输入 输出流
         */
        OutputStream socketOutputStream = socket.getOutputStream();
        InputStream socketInputStream = socket.getInputStream();

        byte[] bytes = new byte[1024];
        int len;
        // 将服务器发送指定文件的字节
        while ((len = fis.read()) != -1) {
            socketOutputStream.write(bytes, 0, len);
        }

        // 传输完毕的提醒
//        socketOutputStream.write("文件传入完毕...".getBytes());

        // 读取服务器发送过来的数据
        /*
            while ((len = bis.read()) != -1) {
            socketInputStream.read(bytes,0,len);
            System.out.println(new String(bytes));
        }
          */

        // 最后一定要关闭socket的输出，否则会进入阻塞状态，源码解析如下
        /*
            从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。在某些输入可用之前，此方法将阻塞。
         */
//        socket.shutdownOutput();
//        socket.shutdownInput();

        // 正常关闭流和socket
        fis.close();
        socket.close();

    }
}
