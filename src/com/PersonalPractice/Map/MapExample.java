package com.PersonalPractice.Map;

import javafx.util.Pair;

import java.util.*;

public class MapExample {
    public Map<Integer, String>  mapping() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Oblesh");
        map.put(5, "Magam");
        map.put(3, "Kiran");
        map.put(2, "Kiran");
        map.put(5, "Sujatha");
        Map<Integer,Pair<Integer, String>> map1 = new HashMap<>();
        List<String> list = Arrays.asList("Hello", "Hi", "Good");

        System.out.println("Map before conversion: " + map);

        Set set1 = map.keySet();
        while(set1.iterator().hasNext()){
            System.out.println(set1);
            break;
        }

        Set set = map.entrySet();
        Iterator itr = set.iterator();
        Map<Integer, String> mainMap = null;
        while (itr.hasNext()) {
            mainMap = map;
            System.out.println(mainMap);
            break;
        }
        return mainMap;
    }

    public static void main(String[] args) {
        MapExample mapExample = new MapExample();
        mapExample.mapping();
    }
}
