package com.spring.configuration;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.model.Products;

@Configuration
public class ProductConfiguration {
	@Bean
	public Products productsBean1() {
		return new Products(155,"Android TV",42599);
	}
	@Bean
	public Products productBean2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Id :-");
		int pid=sc.nextInt();
		System.out.println("Enter Product Name :-");
		String pname=sc.next();
		System.out.println("Enter Product Price :-");
		int proprice=sc.nextInt();
		
		
		return new Products(pid, pname, proprice);
	}
}
