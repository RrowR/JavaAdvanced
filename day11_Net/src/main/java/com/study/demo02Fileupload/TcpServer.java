package com.study.demo02Fileupload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        File file = new File("day11_Net/上传的文件夹");
        if (!file.exists()){
            file.mkdirs();
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file.getPath() + "/" + "picture.png"));
        ServerSocket serverSocket = new ServerSocket(8888);
        // serverSocket不能获得 input 和 output ，不过可以调用accept方法返回一个socket
        /*
            Socket accept() 侦听并接受到此套接字的连接。
         */
        Socket socket = serverSocket.accept();
        /*
            注意，这里是socket的输入输出流
         */
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            // 将网络中传过来的数据读取到服务器磁盘中
            bufferedOutputStream.write(bytes,0,len);
        }

//        outputStream.write("文件存储完毕".getBytes());
//        socket.shutdownInput();
//        socket.shutdownOutput();

        bufferedOutputStream.close();
        serverSocket.close();

    }
}
