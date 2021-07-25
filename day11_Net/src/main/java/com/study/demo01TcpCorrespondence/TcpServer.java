package com.study.demo01TcpCorrespondence;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        // ServerSocket 服务器套接字，想系统索要指定的port，如果不指定那么系统就会为这个 ServerSocket 随机分配一个port
        ServerSocket serverSocket = new ServerSocket(8765);
        // 使用serverSocket方法 获取特有的 套接字
        Socket socket = serverSocket.accept();
        // 获取套接字里的输入流，来读取套接字里的数据
        InputStream inputStream = socket.getInputStream();
        // 获取套接字里的输出流，同样可以向Clinet端发送数据
        OutputStream outputStream = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        // 向Client端写数据
        outputStream.write("我收到了客户端".getBytes());
        socket.close();
        serverSocket.close();
    }
}
