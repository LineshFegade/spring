package com.spring.client;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.spring.model.Profile;

public class profileClient {

public static void main(String[] args) {
		
		//using BeanFactory
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("./src/applicationContext.xml"));
		Profile e1=(Profile) factory.getBean("pro1");		 
		System.out.println(e1);
	

}
}
