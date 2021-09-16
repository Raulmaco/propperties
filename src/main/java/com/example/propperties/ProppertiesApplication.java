package com.example.propperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProppertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProppertiesApplication.class, args);
	}

	@Bean
	public String perfil(){
		return new String();
	}


}
