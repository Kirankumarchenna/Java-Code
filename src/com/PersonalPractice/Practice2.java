package com.PersonalPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice2 {
    public static void main(String[] args) throws IOException {
        try(FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\kich1221\\Desktop")){
            String msg = "Hello this is the message that i am writing";
            byte[] byteArray = msg.getBytes();
            fileOutputStream.write(byteArray);
            System.out.println("Message written to file successfuly!");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

