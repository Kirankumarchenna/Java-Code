package com.netcracker.ProjectPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class LogFile {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("src/Customers.txt");
            String message = "These are the Entries of the latest Customers\n" +
                    "* Sujatha\n" +
                    "* Kiran\n" +
                    "* Sagar\n" +
                    "* Rajini\n" +
                    "* Raju\n";
            outputStream.write(message.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("There is no related file with that name" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Some error occurred");
        } finally {
            if (outputStream != null){
                outputStream.close();
            }
            System.out.println("Your words are written Successfully");
        }
        System.out.println("Program ended Successfully");
    }
}
