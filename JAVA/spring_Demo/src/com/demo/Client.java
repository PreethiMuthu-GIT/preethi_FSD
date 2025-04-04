package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		
		Resource resource= new ClassPathResource("SpringConfig.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		
		Employee emp=(Employee) factory.getBean("pre");
	

		System.out.println(emp);
		
		
		
	}
}
