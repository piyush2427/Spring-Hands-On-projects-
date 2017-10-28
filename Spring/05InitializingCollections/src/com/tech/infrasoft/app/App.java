package com.tech.infrasoft.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.tech.infrasoft.util.EmployeeCollection;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("springcollection.xml"));
		EmployeeCollection empList=(EmployeeCollection) factory.getBean("empList");
		empList.listEmployees();

	}

}
