package com.kenneth.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NavinAlien implements Alien {

	private final Laptop lap;

	@Autowired
	public NavinAlien(@Qualifier("navinLaptop") final Laptop lap) {
		this.lap = lap;
	}

	@Override
	public void code() {
		lap.compile();
	}

}
