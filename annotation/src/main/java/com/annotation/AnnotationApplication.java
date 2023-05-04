package com.annotation;

import Animal.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationApplication  implements CommandLineRunner {

	@Autowired
	@Qualifier("st2")
	private Student student;

/*	@Autowired
	private Employee employee;*/

	@Autowired
	private Dog dog;
	public static void main(String[] args) {
		SpringApplication.run(AnnotationApplication.class, args);
	}

	@Override
	public  void run(String... args) throws Exception{
		this.student.studying();
		//this.employee.helloWorld();
		this.dog.eating();
	}
}
