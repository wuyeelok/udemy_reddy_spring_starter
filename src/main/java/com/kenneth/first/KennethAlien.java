package com.kenneth.first;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class KennethAlien implements Alien {

	private final Laptop lap;

	public KennethAlien(@Qualifier("kennethLaptop") final Laptop lap) {
		this.lap = lap;
	}

	@Override
	public void code() {

		lap.compile();

	}

}
