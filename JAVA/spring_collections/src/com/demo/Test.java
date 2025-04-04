package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("SpringConfig.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		
		Student stud=(Student) factory.getBean("pre");
		System.out.println(stud);
		
	}
}
