package com.kenneth.first;

import org.springframework.stereotype.Component;

@Component
public class NavinAlien implements Alien {

	@Override
	public void code() {
		System.out.println("I'm Coding...");
	}

}
