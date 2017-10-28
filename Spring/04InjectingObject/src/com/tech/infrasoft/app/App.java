/**
 * 
 */
package com.tech.infrasoft.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.tech.infrasoft.bean.Address;
import com.tech.infrasoft.bean.Employee;

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
		BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("SpringConfig.xml"));
		Employee emp1=(Employee) beanFactory.getBean("emp1");
		System.out.println(emp1);
		
	
	}

}
