package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"Animal"})
public class MyConfig {

    @Bean("st1")
    @Lazy
    public Student getStudent(){
        //System.out.println("Creating student object");
        System.out.println("Creating first object");
        return new Student("Kabir aneja");
    }

    @Bean("st2")
    @Lazy
    public Student getNewStudent(){
        System.out.println("Creating second student");
        return new Student("Sahil sharma");
    }
}
