package com.br.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CrudSimplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSimplesApplication.class, args);
	}

}
