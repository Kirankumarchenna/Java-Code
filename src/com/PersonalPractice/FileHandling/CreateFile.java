package com.PersonalPractice.FileHandling;

import java.io.File;

public class CreateFile {
    public static void main(String[] args){
        try {
            File myFile = new File("C:\\Users\\kich1221\\Desktop\\myFile.txt");
            if(myFile.createNewFile()){
                System.out.printf("New %s File, has been created in the location: %s ",myFile.getName(), myFile.getAbsolutePath());
            }else{
                System.out.printf("File already exists at %s, you can use it\n",myFile.getAbsolutePath());
            }
        }catch (Exception e){
            System.out.println("Error in creating the file"+e.getMessage());
        }
        System.out.println("File has successfully created");
    }
}
