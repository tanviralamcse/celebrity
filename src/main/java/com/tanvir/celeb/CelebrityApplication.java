package com.tanvir.celeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CelebrityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CelebrityApplication.class, args);
	}

}
