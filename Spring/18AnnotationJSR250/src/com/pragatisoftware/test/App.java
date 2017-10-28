package com.pragatisoftware.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pragatisoftware.bean.Shape;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		context.registerShutdownHook(); 
		Shape shape=(Shape)context.getBean("circle");
		shape.draw();
		shape=(Shape)context.getBean("line1");
		shape.draw();
		
	}

}
