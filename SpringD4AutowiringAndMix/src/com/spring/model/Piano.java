package com.spring.model;

import org.springframework.stereotype.Component;

@Component("insts2")
public class Piano implements Instrument{

	@Override
	public void play() {
		System.out.println("~~~~piano~~~~~");
		
	}

}
