package com.netcracker.ProjectPractice;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Task1{
    public static void main(String[] args) throws Exception{
        String filePath = "C:\\Users\\kich1221\\Desktop\\Task1.txt";
        File file = new File(filePath);
        for (String s : Arrays.asList("Node", "Host", "PID", "event type", "Event-Timestamp", "Result-Code"))
            Files.lines(Paths.get(filePath)).filter(str -> str.contains(s)).forEach(System.out::println);
    }
}
