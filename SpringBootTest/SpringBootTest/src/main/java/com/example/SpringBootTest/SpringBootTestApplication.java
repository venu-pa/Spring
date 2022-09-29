package com.example.SpringBootTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestApplication {

	public static void main(String[] args) {
		System.out.println("1");
		SpringApplication.run(SpringBootTestApplication.class, args);
		System.out.println("0");
	}

}
