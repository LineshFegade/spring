package com.spring.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.spring.model.Instrument;
import com.spring.model.Instrumentalist;

public class InstrumentClient {
public static void main(String[] args) {
	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("./src/applicationContext.xml"));
	Instrumentalist i11=(Instrumentalist) factory.getBean("inst1"); 
	Instrumentalist i22=(Instrumentalist) factory.getBean("inst2"); 
	Instrumentalist i32=(Instrumentalist) factory.getBean("inst3"); 

	i11.perform();
	i22.perform();
	i32.perform();
}
}
