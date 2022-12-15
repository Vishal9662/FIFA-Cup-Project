package com.vh.IQ.FIFA.Cup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.vh.IQ.FIFA.Cup.repository")
public class FifaCupApplication {

	public static void main(String[] args) {
		SpringApplication.run(FifaCupApplication.class, args);
		System.out.println("Running.....");
	}

}
