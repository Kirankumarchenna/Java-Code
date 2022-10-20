package com.netcracker.ProjectPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadLogFile {
    public static void main(String[] args) throws IOException{
       try(InputStream inputStream = new FileInputStream("Task1.txt")){
           int data;
           do{
              data = inputStream.read();
              System.out.println((char)data);
           }while(data != -1);
           inputStream.close();
       } catch (FileNotFoundException e) {
           System.out.println("Cannot open the file! "+ e.getMessage());
       }
    }
}
