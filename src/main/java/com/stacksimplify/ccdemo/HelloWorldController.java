package com.stacksimplify.ccdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Welcome to Java Application
			Java is the Queen of programming languages. It beholds the pride of the most preferred programming language by software developers!
	
   			Come and Explore Java!";
	}
	
}
