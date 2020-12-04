package com.spring.model;

import org.springframework.stereotype.Component;

@Component("insts1")
public class Guitar implements Instrument{

	@Override
	public void play() {
		System.out.println("~~~~~Guitar~~~~~");
	}

}
