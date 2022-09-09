package dev.titans.recipient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "dev.titans" )
public class RecipientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipientApplication.class, args);
	}

}
