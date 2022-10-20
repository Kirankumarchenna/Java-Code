package com.netcracker.javademos.day7;

public class NestedInnerClass {

    private final String companyName = "Netcracker";

    private class Location{

        private String city = "Pune";
        public void display(){
            System.out.printf("I am working at %s, %s\n", companyName, this.city);
          //  System.out.println("I am working at " +  companyName + this.city);
        }

        public void setCity(String city){
            this.city = city;
        }
    }

    public static void main(String[] args) {
        NestedInnerClass parent = new NestedInnerClass();
        Location location = parent.new Location();
        location.display();
        location.setCity("Moscow");
        location.display();
    }
}
