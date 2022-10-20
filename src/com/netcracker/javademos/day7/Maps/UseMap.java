package com.netcracker.javademos.day7.Maps;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
    public static void main(String[] args) {
        Map<String, String> Relation = new HashMap<>();
        Relation.put("KI", "Shran");

        System.out.println("Daughter of KI:" + Relation.get("KI"));
    }
}
