package com.example.simple_spring_project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringProjectApplication implements CommandLineRunner {
	private final MyApplication myApplication;

	@Autowired
	public SimpleSpringProjectApplication(MyApplication myApplication) {
		System.out.println("SimpleSpringProjectApplication Constructor: " + this.getClass().getSimpleName());
		this.myApplication = myApplication;
	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// This method will be executed after the application context is loaded
		myApplication.processMessage();
	}
}
