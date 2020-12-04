package com.spring.client;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.spring.model.Instrument;

public class InstrumentClient {
@SuppressWarnings({ "deprecation", "unused" })
public static void main(String[] args) {
	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("./src/applicationContext.xml"));
	Instrument i1=(Instrument) factory.getBean("i1");
	Instrument i2=(Instrument) factory.getBean("i2");
	Instrument i3=(Instrument) factory.getBean("i3");


}
}
