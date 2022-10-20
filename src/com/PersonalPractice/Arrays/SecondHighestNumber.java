package com.PersonalPractice.Arrays;

import org.apache.log4j.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SecondHighestNumber {
    private static final Logger LOGGER = LogManager.getLogger(SecondHighestNumber.class);
    static {
        try {
            Layout layout = new SimpleLayout();
            Appender appender = new FileAppender(layout, "C:\\Users\\kich1221\\Desktop\\My Trainings\\Logs\\SecondHighestLogs.txt", false);
            LOGGER.addAppender(appender);
            LOGGER.setLevel(Level.ALL);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        LOGGER.trace("com.PersonalPractice.Arrays.SecondHighestNumber.main() started");
        /*
            So, below is the syntax of using the collection framework we are converting the Array to List
            by creating a simple list object
         */
        Integer[] b = {45, 67, 56, 76, 78, 89, 78};
        List<Integer> list1 = Arrays.asList(b);
        LOGGER.debug( "The List1 has been updated with the values {}");
        System.out.println(list1);

        int[] a = {45, 67, 56, 76, 78, 89, 78};
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, Arrays.stream(a).boxed().toArray(Integer[]::new));
        LOGGER.debug("Converting the Array to List");
        System.out.println("Converted List from Array {}"+list);
        /*
            Arrays.sort(a);                       //Quick method of sorting using Arrays.sort API
            int b = a.length;
            System.out.println("Second largest number: "+a[a.length-2]);
        */
        System.out.println("Array before sorting: "+Arrays.toString(a));
        for(int i=0; i< a.length;i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    a[i] = a[i]+a[j];
                    a[j] = a[i]-a[j];
                    a[i] = a[i]-a[j];
                }
            }
        }
        int c = a[a.length-2];
        System.out.println(c);
        System.out.println(Arrays.toString(a));

        LOGGER.trace("com.PersonalPractice.Arrays.SecondHighestNumber.main() ended");

        /**
         * This is a logic to split the string value with the regular expression
         */
        String str = "I*am*a*big*guy";
        String[] strn = str.split("\\*", 3);
        for (String st:strn){
            System.out.println(st);
        }
    }
}
