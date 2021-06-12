package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
/**
 * @EnableAutoConfiguration: enable Spring Boot's auto-configuration mechanism
 * @ComponentScan: enable @Component scan on the package where the application is located
 * @Configuration: allow to register extra beans in the context or impoer additional configuration classes
 *
 * */
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name",defaultValue = "World") String name){
		return String.format("Hello %s",name);
	}

}
