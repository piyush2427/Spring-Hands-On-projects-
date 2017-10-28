package com.tech.infrasoft.app;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("SpringConfig.xml"));
		
		
Triangle tri=(Triangle) beanFactory.getBean("triangle");
System.out.println(tri);
Circle cri=(Circle) beanFactory.getBean("circle");
System.out.println(cri);
			

		/*Triangle pt1=(Triangle) beanFactory.getBean("point");
		
		Point pt=(Point) beanFactory.getBean("X");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Point A");
		int x= sc.nextInt();
		pt.setX(x);
		int y=sc.nextInt();
		pt.setY(y);
		
		pt1.pointA=pt;
		
		System.out.println(pt.toString());
		
		System.out.println("Enter Point B");
		int x1= sc.nextInt();
		pt.setX(x1);
		int y1=sc.nextInt();
		pt.setY(y1);
		
		pt1.pointB=pt;
		
		System.out.println(pt.toString());
		
		System.out.println("Enter Point C");
		int x2= sc.nextInt();
		pt.setX(x2);
		int y2=sc.nextInt();
		pt.setY(y2);
		
		pt1.pointC=pt;
		
		System.out.println(pt.toString());
		
		System.out.println(pt1.toString());*/
		
		

	}

}
