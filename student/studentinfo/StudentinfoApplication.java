package com.student.studentinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@ComponentScan({"com.student"})
@EntityScan("com.student.domain")
@EnableJpaRepositories("com.student.repository")
public class StudentinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentinfoApplication.class, args);
	}

}
