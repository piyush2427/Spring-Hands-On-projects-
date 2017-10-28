package com.pragatisoftware.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pragatisoftware.bean.Shape;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		Shape shape=(Shape)context.getBean("circle");
		shape.draw();
		shape=(Shape)context.getBean("line1");
		shape.draw();
		
	}

}
