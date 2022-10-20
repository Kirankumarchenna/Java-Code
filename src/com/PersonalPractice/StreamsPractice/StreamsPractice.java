package com.PersonalPractice.StreamsPractice;


import org.apache.log4j.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamsPractice {
    private int stream;
    private static Logger logger = Logger.getLogger(StreamsPractice.class);
    static{
        try {
            Layout layout = new HTMLLayout();
            Appender appender = new FileAppender(layout,"MyLogs.html", false);
            /*Layout layout = new SimpleLayout();
            Appender appender = new ConsoleAppender(layout);*/
            logger.addAppender(appender);
            logger.setLevel(Level.ALL);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public Integer setStream(int Stream){
        String msg = "Hello this is the setter message";
        logger.debug(stream);
        this.stream = Stream;
        return stream;
    }
    static public void main(String[] args) {
        try {
            List<Integer> list = new ArrayList<>();
            list.add(70);
            list.add(29);
            list.add(80);
            list.add(30);
            list.add(20);
            list.add(56);
            List<Integer> listuu = Arrays.asList(89, 78, 78);
            logger.info("Added the elements to the list<>");
            List<Integer> listu = Arrays.asList(45, 54, 65, 63);
            logger.trace("com.PersonalPractice.StreamsPractice::Added the elements to the list using as list method()");
            System.out.println("Starting List: " + list);

            List<Integer> list2 = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
            logger.trace("Filtered the stream elements an dcollected into list");
            System.out.println("List after Filtering even numbers:  "+ list2);

            List <Integer> list1 = list.stream().map(i->i+10).collect(Collectors.toList());
            System.out.println("List after Mapping: " + list1);
            long noOfFailedStudents = list.stream().filter(i->i<30).count();
            logger.debug("Collected the list of number of failed students");
            System.out.println("Failed Students count: "+ noOfFailedStudents);

            List<Integer> list3 = list.stream().filter(i->i<30).collect(Collectors.toList());
            logger.debug("This is a filter list<>");
            System.out.println("Collection of failed Students: "+ list3);

            List<Integer> list4 = list.stream().filter(sha->sha<30).map(sha->sha+10).collect(Collectors.toList());
            logger.debug("Added the grace marks");
            System.out.println("Adding gracemarks to failed students: "+ list4);

            List<Integer> list5 = list4.stream().sorted().collect(Collectors.toList());
            System.out.println("Sorted order: "+list5);
            System.out.println("All the Students are now eligible and promoted to the Next class");

            List<Integer> list6 = list.stream().sorted((i1, i2)-> i1.compareTo(i2)).collect(Collectors.toList());
            logger.debug("List of all the sorted students {}");
            System.out.println("Sorted Using comparator: "+list6);

            Comparator<Integer> c = (i1, i2)->(i1<i2)?1:(i1>i2)?-1:0;
            List<Integer> list7 = list.stream().sorted(c).collect(Collectors.toList());
            logger.debug("This is a log message using the comparator");
            System.out.println("Using Comparator: "+list7);

            List<Integer> list8 = list.stream().sorted((i1, i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
            System.out.println("Comparing using compareTo: "+ list8);

        }catch (Exception e){
            System.out.println("You cannot do this operation "+ e.getMessage());
           e.printStackTrace();
        }

        StreamsPractice streamsPractice = new StreamsPractice();
        System.out.println(streamsPractice.setStream(90));
    }
}
