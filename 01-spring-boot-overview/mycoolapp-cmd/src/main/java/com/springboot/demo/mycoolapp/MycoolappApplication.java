package com.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}


	/*
	NOTES
	LESSON 1
	+Since Spring Boot is being used - the server is embedded in this JAR file
	+This means that, Spring Boot apps are self-contained, there is no need to have a seperate server installed

	To run in the command line use:
	1. java -jar mycoolapp-cmd.jar
	2. Use spring boot maven plugin: mvnw spring-boot:run

	Further we can use the maven plugin to packge or run the app.
	MAC
	1. $ ./mvnw package
	2. $ ./mvnw spring-boot:run

	WINDOWS
	1. mvnw package and access in the same directory using target\appname.0.0.1.SNAPSHOOT.jar
	2. mvnw spring-boot:run
	*/
}
