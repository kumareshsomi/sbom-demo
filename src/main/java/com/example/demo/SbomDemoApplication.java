package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbomDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello SBOM World");
		SpringApplication.run(SbomDemoApplication.class, args);
	}

}
