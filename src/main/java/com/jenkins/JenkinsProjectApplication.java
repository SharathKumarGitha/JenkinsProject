package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProjectApplication {

	public static void  main(String[] args) {
		SpringApplication.run(JenkinsProjectApplication.class, args);
		System.out.println("standard java project...");
		System.out.println("this is second line...");
		System.out.println("third line");
		System.out.println("fourth line");
		System.out.println("fifth line");
		System.out.println("this is sixth line");
		System.out.println("this is seventh line");
	}

}
