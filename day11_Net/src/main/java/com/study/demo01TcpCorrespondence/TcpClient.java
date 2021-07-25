package com.study.demo01TcpCorrespondence;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
    /*
        public class Socket extends Object 此类实现 客户端 套接字
        构造方法摘要:
            Socket(InetAddress address, int port) 创建一个流套接字并将其连接到指定 IP 地址的指定端口号。

        成员方法：
            OutputStream getOutputStream() 返回此套接字的输出流。
            InputStream getInputStream() 返回此套接字的输入流。
            void close() 关闭此套接字。
     */
        Socket socket = new Socket("localhost", 8765);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        outputStream.write("您好呀，服务器".getBytes());
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        socket.close();
    }
}
