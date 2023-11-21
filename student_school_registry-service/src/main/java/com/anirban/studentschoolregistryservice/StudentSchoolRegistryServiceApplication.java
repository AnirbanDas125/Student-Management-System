package com.anirban.studentschoolregistryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StudentSchoolRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentSchoolRegistryServiceApplication.class, args);
	}

}
