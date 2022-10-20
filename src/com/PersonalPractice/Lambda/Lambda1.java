package com.PersonalPractice.Lambda;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda1 {

    public static void main(String [] args)throws Exception
    {
        List<String> list;
        List<String> nec=new ArrayList<String>();
        List<String> result1=new ArrayList<String>();
        File file=new File("C:\\Users\\maob1221\\Desktop\\DDRS1.txt");

        list =Files.readAllLines(file.toPath(),Charset.defaultCharset());

        for (String line : list) {
            String[] result=line.split("RMA Network Message Receiver");
            for (int j = 0; j < result.length; j++) {
                nec.add(result[j]);
            }
        }
        System.out.println(nec);
        for(String line : list)
        {
            result1.add(Arrays.toString(line.split("Node")));
            result1.add(Arrays.toString(line.split("Session_id")));
            result1.add(Arrays.toString(line.split("Event_Source")));
            result1.add(Arrays.toString(line.split("Event_Type")));
            result1.add(Arrays.toString(line.split("Event_TimeStamp")));
            result1.add(Arrays.toString(line.split("Result_code")));
        }
        for (String s : result1) {
            System.out.println(s);
        }
    }
}
