package com.netcracker.javademos.day7.Lambda;

interface spaceInsertion {
    String wordToBeManipulate(String a);
}

public class insertClass {
    public static void main(String[] args) {
            spaceInsertion insert = (a) -> {
              return "";/*for(int i=0; i<a.length(); i++){
                  if(i%2==1){
                      char b = a.charAt(i);
                  }

                };*/
            };
        System.out.println(insert.wordToBeManipulate("Hello"));
    }
}
