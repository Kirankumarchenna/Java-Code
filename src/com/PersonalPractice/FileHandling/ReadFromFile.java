package com.PersonalPractice.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ReadFromFile {
    public static void main(String[] args){
       try{
           File myFile = new File("C:\\Users\\kich1221\\Desktop\\Hello.txt");
           Scanner sc = new Scanner(myFile);
           String Content = "";
           while(sc.hasNextLine()){
               Content = Content.concat(sc.nextLine());
           }
           FileWriter fw = new FileWriter("C:\\Users\\kich1221\\Desktop\\HelloBabai.txt");
           fw.write(Content);
           fw.close();
           System.out.println("So, wait! are you busy right now, I have done my coping Task!");
       }catch (FileNotFoundException e){
           System.out.println("Your file is missing: "+e.getMessage());
       }catch (IOException e){
           System.out.println("Some error occurred: "+e.getMessage());
       }
    }
}
