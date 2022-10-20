package com.netcracker.javademos.day3;

public class FacebookProfile {
   private String email;
   private String name;
   private String location;
   private String mobile;
   private String schoolName;
   private String employer;

   public FacebookProfile(){

   }
   public FacebookProfile(String email){
       this.email=email;
   }
   public FacebookProfile(String email, String name, String mobile){
       this.email = email;
       this.name = name;
       this.mobile = mobile;
   }
   public String getEmail(){
       return email;
   }
   public void setEmail(String email){
       this.email = email;
   }
   public String getName(){
       return name;
   }
   public void setName(){
       this.name = name;
   }
   public String getMobile(){
       return mobile;
   }
    
}
