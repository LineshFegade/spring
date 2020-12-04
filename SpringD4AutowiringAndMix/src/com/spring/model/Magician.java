package com.spring.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("magiciens")
@Scope("prototype")
public class Magician {
	private String magicWord;
	
	
	
	public Magician(String magicWord) {
		super();
		this.magicWord = magicWord;
	}



	public Magician() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public String getMagicWord() {
		return magicWord;
	}



	public void setMagicWord(String magicWord) {
		this.magicWord = magicWord;
	}



	public void perform() {
		System.out.println("Magicien utters :-"+magicWord);
	}
}
