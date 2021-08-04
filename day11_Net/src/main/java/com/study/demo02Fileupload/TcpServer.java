package com.study.demo02Fileupload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        // ServerSocket为服务器端用来接收数据的会话，要设置接收的端口号
        ServerSocket serverSocket = new ServerSocket(8888);
        // 服务端需要调用serverSocket.accept方法监听才能获得真正具有文件传输的Socket
        Socket socket = serverSocket.accept();
        // 获取socket的输入流，读取流中的内容
        InputStream socketInputStream = socket.getInputStream();
        // 获取socket的输入流，向Clinet输出数据
        OutputStream socketOutputStream = socket.getOutputStream();
        // 本地创建一个output来写出数据
        File file = new File("day11_Net/上传的文件夹");
        if (!file.exists()) {
            file.mkdir();
        }
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(file, "picture.png")));
        int len;
        byte[] bytes = new byte[1024];
        while ((len = socketInputStream.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.close();
        socketOutputStream.write("传输完成!!!".getBytes());
        // 这里server也要发送一个结束标记给client，否则client端会出现Exception in thread “main“ java.net.SocketException: Connection reset
        socket.shutdownOutput();
        serverSocket.close();
    }
}
