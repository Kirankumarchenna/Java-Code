package com.netcracker.javademos.day10;

import java.io.*;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) throws IOException{
        try(Socket socket  = new Socket ("10.236.182.124",6666);
            InputStream inputStream = socket.getInputStream();
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(inputStream));
            PrintWriter toServer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            BufferedReader fromKeyboard = new BufferedReader(new InputStreamReader(System.in))){
            String outData = "";
            String inData = "";
            do {
                inData = fromServer.readLine();
                System.out.println("Server:" + inData);
                outData = fromKeyboard.readLine();
                toServer.println(outData);
            } while (!"STOP".equals(outData));
        }
        System.out.println("End of client communication channel");
    }
}
