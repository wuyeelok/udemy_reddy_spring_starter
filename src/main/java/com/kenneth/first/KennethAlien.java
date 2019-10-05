package com.kenneth.first;

import org.springframework.stereotype.Component;

@Component
public class KennethAlien implements Alien {

	@Override
	public void code() {

		System.out.println("I am dubugging!");

	}

}
