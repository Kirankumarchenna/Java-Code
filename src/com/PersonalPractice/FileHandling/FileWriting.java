package com.PersonalPractice.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\kich1221\\Desktop\\PracticeFile.txt");
            fileWriter.write("File operations are very important " +
                    "while studying a programming language.\n" +
                    "Some languages have a better reader API for reading files " +
                    "and filtering the data than others.\nBut the concept of parsing " +
                    "the file remains the same and is helpful while Designing a Microservice" +
                    " that reads data from a file and inserts it into Database.");
            fileWriter.close();
            System.out.println("The file has successfully written.");
        }catch (FileNotFoundException e){
            System.out.println("The file does not exist "+e.getMessage());
        }
    }
}
