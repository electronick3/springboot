package ru.chagay.springboot.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SpringBApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBApplication.class, args);
	}

	@RequestMapping("/**")
    public String helloWorld() {
        return "Hello World";
    }
}
