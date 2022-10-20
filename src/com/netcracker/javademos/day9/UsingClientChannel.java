package com.netcracker.javademos.day9;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class UsingClientChannel {
    public static void main(String[] args) throws IOException, InterruptedException {
        String[] messages = new String[]{"Hello Vinod", "How are you doing", "STOP"};
        SocketChannel client = SocketChannel.open(new InetSocketAddress("10.236.182.124",6666));
        for(String message: messages){
            ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());
            client.write(buffer);
            System.out.println("Sent Message: "+message);
            buffer.clear();
            Thread.sleep(3000);
        }
        client.close();
    }
}
