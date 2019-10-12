package com.stackroute.domain;
@Component
public class Actor {
    private String name;
    private String gender;
    private int age;

    public Actor(String name,String gender,int age){
        this.age=age;
        this.gender=gender;
        this.name=name;
    }

    public String getDetails(){
         return name+" "+ age+" "+gender;
    }

}
