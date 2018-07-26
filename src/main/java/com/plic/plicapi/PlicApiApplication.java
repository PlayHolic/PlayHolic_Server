package com.plic.plicapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PlicApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlicApiApplication.class, args);
	}
}
