package com.blockmango.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("helloworld")
	public String helloworld() {
		return "Hello world, My name is Arthur!";
	}

	@RequestMapping(value="health-check", method=RequestMethod.GET)
	public String requestMethodName() {
		return new String("Ok");
	}
	
}
