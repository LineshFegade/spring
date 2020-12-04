package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.AppConfiguration;
import com.spring.model.Instrumentalist;
import com.spring.model.Magician;

public class Test {
	public static void main(String[] args) {
		
		
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		
		 Magician m1=(Magician) context.getBean("perform"); 
		 Magician m2=(Magician) context.getBean("perform");
		  
		  m1.perform();
		  m2.perform();
			
		
		Instrumentalist i1=(Instrumentalist) context.getBean("instrumentList");
		i1.perform();
	}
}
