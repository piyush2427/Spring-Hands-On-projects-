package com.pragatisoftware.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring.xml");
		context.registerShutdownHook();

		String s = context.getMessage("greetings", null, "greeting2",	null);

		System.out.println(s);

	}

}
