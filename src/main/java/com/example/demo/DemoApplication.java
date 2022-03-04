package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	//maven clean
	//maven install
	//java -jar [name of jar file in target folder] --server.port=8081
		//This runs an instance of your application, port is optional
}
