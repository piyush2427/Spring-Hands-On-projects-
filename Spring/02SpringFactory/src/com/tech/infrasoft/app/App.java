package com.tech.infrasoft.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("SpringConfig.xml"));
	
		HelloWorld greetings=(HelloWorld) beanFactory.getBean("helloBean");
		System.out.println("Hello, "+ greetings.getMsg());
	}

}
