package com.william.marvelspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.william"})
public class MarvelSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvelSpringApplication.class, args);
	}

}
