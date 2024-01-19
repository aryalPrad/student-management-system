package com.srijana.sms;

import com.srijana.sms.entity.Student;
import com.srijana.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1= new Student("Ramesh", "Sharma","ramesh@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2= new Student("Gopal", "thapa","gopal@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3= new Student("John", "Snow","john@gmail.com");
//		studentRepository.save(student3);

	}
}
