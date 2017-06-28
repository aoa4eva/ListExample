package me.aoa4eva.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "me.aoa4eva" })
public class ValidationtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidationtestApplication.class, args);
	}
}
