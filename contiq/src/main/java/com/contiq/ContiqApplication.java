package com.contiq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContiqApplication {

	public static void main(String[] args) {
		System.out.println("hey");
		SpringApplication.run(ContiqApplication.class, args);
	}

}
