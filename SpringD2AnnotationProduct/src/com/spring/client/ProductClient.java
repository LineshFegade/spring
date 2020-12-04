package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.ProductConfiguration;
import com.spring.model.Products;

public class ProductClient {
	public static void main(String[] args) {
	
	ApplicationContext context=new AnnotationConfigApplicationContext(ProductConfiguration.class);
		Products p1=(Products) context.getBean("productsBean1");
		Products p2=(Products) context.getBean("productBean2");
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
