package com.examples.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examples.demo.entity.Microfono;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Microfono mic = new Microfono();
		
		mic.setName(" v ");

		mic.getName();

	}

}
