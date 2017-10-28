/**
 * 
 */
package com.tech.infrasoft.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Piyush
 *
 */
public class App {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		HelloWorld greetings=(HelloWorld) context.getBean("helloBean");
		System.out.println("Hello "+ greetings.getMsg());
	}

}
