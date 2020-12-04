package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.ProductConfiguration;
import com.spring.model.Product;

public class ProductClient {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(ProductConfiguration.class);
	
	Product p1=(Product) context.getBean("productBean");
	Product p2=(Product) context.getBean("productBean ");
	p2.setProductId(45);
	p2.setProductName("TV");
	p2.setProductPrice(45000);
	System.out.println(p1);
	System.out.println(p2);
	
}
}
