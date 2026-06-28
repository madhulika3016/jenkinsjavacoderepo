package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsCodeDeployDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsCodeDeployDemoApplication.class, args);
		System.out.println("New Changes");
	}

}
