package com.example.learnlombok;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class LearnLombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnLombokApplication.class, args);
		log.info("Hi I am from {}.", "Slf4j on Lombok");
	}

}
