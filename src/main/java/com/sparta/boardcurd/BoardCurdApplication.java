package com.sparta.boardcurd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BoardCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardCurdApplication.class, args);
	}
}
