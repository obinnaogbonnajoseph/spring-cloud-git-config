package com.cloud.setup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SetupApplication {

	public static void main(String[] args) {
		SpringApplication.run(SetupApplication.class, args);
	}

}