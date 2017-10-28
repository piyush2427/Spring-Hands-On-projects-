/**
 * 
 */
package com.tech.infrasoft.autowiredemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.tech.infrasoft.app.Triangle;

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
		BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));

		Triangle tri=(Triangle) beanFactory.getBean("triangle");
		System.out.println(tri);

	}

}
