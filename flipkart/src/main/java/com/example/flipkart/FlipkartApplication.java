package com.example.flipkart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlipkartApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FlipkartApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello world!");
	}

}

