package com.study.demo02Fileupload;

import java.io.*;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        // 创建Client的socket，设置ip(本地)，程序的port用来传输数据
        Socket socket = new Socket("127.0.0.1", 8888);
        /*
            获取client客户端socket的inputstream和outputstream
         */
        OutputStream socketOutputStream = socket.getOutputStream();
        InputStream socketInputStream = socket.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day11_Net/nekohashuzuku.png"));
        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            /*
                将本地的BufferedInputStream里读取的图片文件通过socket来进行写出
                注意：网络传输的过程中一定要是字节才可以
             */
            socketOutputStream.write(bytes,0,len);
        }
        socket.shutdownOutput();
        /*
            向服务端发送一个结束符号，告诉服务端，文件已经传输完毕，否则服务端的serverSocket将进入阻塞状态
         */
        while ((len = socketInputStream.read(bytes)) != -1) {
            // 这里一定要设置起始值和结束值，不然打印出来是一个乱码，因为bytes后面的内容和输出的无关
            System.out.println(new String(bytes,0,len));
        }

        socket.close();




    }
}
