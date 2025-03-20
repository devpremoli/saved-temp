package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);
			//createMultipleStudent(studentDAO);
			readStudent(studentDAO);
		};
	}

	private void readStudent(StudentDAO studentDAO) {
		// create student
		Student tempStudent = new Student("Ajay", "Bk", "ajay@gmail.com");
		System.out.println("Reading student...");

		// save student
		System.out.println("Student saved.");
		studentDAO.save(tempStudent);

		// retrieve student with given Id
		System.out.println("Retrieving student with Id: " + tempStudent.getId());
		Student myStudent = studentDAO.findById(tempStudent.getId());
		// display student
		System.out.println("Retrieved student: " + myStudent);
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		System.out.println("Creating 3 student objects");
		Student tempStudent1 = new Student("Pradeep", "Lamichhane", "pradeep@gmail.com");
		Student tempStudent2 = new Student("Sanjay", "Subedi", "sanjay@gmail.com");
		Student tempStudent3 = new Student("Ujjwal", "Adhikari", "ujjwal@gmail.com");

		System.out.println("Saving the students");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating student");
		Student tempStudent = new Student("Prem", "Oli", "devpremoli@gmail.com");

		// save the student object
		System.out.println("Saving student");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}
}
