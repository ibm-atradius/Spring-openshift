package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOpenshiftApplication {
	
	@GetMapping("/")
	public String SayHi() {
		return"Deloyed Using Openshift";
	}
	
	@GetMapping("/{input}")
	public String SayHiInput(@PathVariable String input) {
		return input +"Openshift deployed Sucessfuly";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringOpenshiftApplication.class, args);
	}

}
