package com.github.bproenca.dbins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DbInsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbInsApplication.class, args);
	}

}
