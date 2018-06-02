package com.ini;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by yjdini on 2017/7/29.
 */
public class TCPServer {
    public static void main(String[] args) throws Exception{
        System.out.println("server start...");
        ServerSocket ss = new ServerSocket(10005);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String receiveDataStr=null;
        while((receiveDataStr=br.readLine())!=null){
            if(receiveDataStr.equals("bye")){
                break;
            }
            System.out.println("receive data:"+receiveDataStr);
        }
    }
}
