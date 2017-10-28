package com.tech.infrasoft.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.tech.infrasoft.bean.Line;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));*/
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//context.registerShutdownHook();
		Line line1=(Line) context.getBean("line1");
		System.out.println(line1);
		Line line2=(Line) context.getBean("line2");
		System.out.println(line2);
		
		
	}

}
