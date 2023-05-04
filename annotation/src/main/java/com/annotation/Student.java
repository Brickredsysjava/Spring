package com.annotation;

public class Student {

    String name;

    public Student(String name){
        this.name=name;
    }
    public void studying(){
        System.out.println("I am studying " + this.name);
    }
}
