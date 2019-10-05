package com.kenneth.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstprojApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(FirstprojApplication.class, args);

		Alien obj1 = context.getBean("kennethAlien", Alien.class);

		obj1.code();

		Alien obj2 = context.getBean("navinAlien", Alien.class);

		obj2.code();

	}

}
