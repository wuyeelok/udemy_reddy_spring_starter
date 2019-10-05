package com.kenneth.first;

import org.springframework.stereotype.Component;

@Component
public class KennethLaptop implements Laptop {

	@Override
	public void compile() {

		System.out.println("SUCESS compile!");

	}

}
