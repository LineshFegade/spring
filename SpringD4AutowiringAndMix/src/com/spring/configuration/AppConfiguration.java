package com.spring.configuration;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.model.Magician;

@Configuration
@ComponentScan("com.spring.model")
public class AppConfiguration {
	
	@Bean
	@Scope("prototype")
	public Magician perform() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter magic word :-");
		String mg=sc.next();
		
		return new Magician(mg);
	}
}
