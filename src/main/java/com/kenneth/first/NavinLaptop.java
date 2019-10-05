package com.kenneth.first;

import org.springframework.stereotype.Component;

@Component
public class NavinLaptop implements Laptop {

	@Override
	public void compile() {
		
		System.out.println("Compiling");
		
	}

}
