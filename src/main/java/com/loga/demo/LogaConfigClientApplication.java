package com.loga.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogaConfigClientApplication implements CommandLineRunner {

	@Value("${my.prop}")
	private String myProperty;

	public static void main(String[] args) {
		SpringApplication.run(LogaConfigClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("My Property: " + myProperty);
	}

}
