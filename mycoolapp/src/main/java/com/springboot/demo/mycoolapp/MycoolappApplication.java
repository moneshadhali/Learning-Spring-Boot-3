package com.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

	//Notes
	/*
	Maven is a project management tool that helps developers manage their applications. Its primary uses include:

	1. Dependency Management: Maven automatically handles downloading and including the necessary libraries (called JAR files) for your project. Instead of manually downloading each JAR from various websites, you just provide Maven with a list of what you need, and it fetches them for you.
	2. Build Automation: It offers a standardized way to build your projects, allowing you to focus on coding while Maven takes care of the build lifecycle.
	3. Project Structure: A Maven project follows a predefined directory structure, with a configuration file called pom.xml at the project's root. This file outlines your project's dependencies, build instructions, and other configurations.
						  It also includes GAV which outlines the projects group name, artificial id and version name which is important info used when using the project in dependencies.

	In summary, Maven simplifies the process of managing libraries and building your Java projects efficiently, acting as a “friendly helper” that streamlines development efforts.

	mvnw and mvnw.cmd - checks to make sure the computer has maven installed. If they don't then install the maven (one file is for windows and the other for mac file)
	src/main/jave - where the souce code resides
	src/main/resources - The src/main/resources directory in a Maven project is where you store configuration files and resources that your application needs at runtime. This could include properties files, XML files, and any other non-Java resources.
	src/test - where the test files sources resides

	 */
}
