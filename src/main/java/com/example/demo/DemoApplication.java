package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ct= SpringApplication.run(DemoApplication.class, args);
		System.out.print("Its is working  >>>>>>>>>>");
		
		Alien a= ct.getBean(Alien.class);
		a.show();
	}

}
