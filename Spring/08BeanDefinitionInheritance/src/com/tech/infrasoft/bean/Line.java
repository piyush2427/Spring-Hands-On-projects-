/**
 * 
 */
package com.tech.infrasoft.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Piyush
 *
 */
public class Line implements InitializingBean,DisposableBean {
	private Point pointA;
	private Point pointB;
	
	
	
	public Line() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Line(Point pointA, Point pointB) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
	}



	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	@Override
	public String toString() {
		return "Line [pointA=" + pointA + ", pointB=" + pointB + "]"+"==="+super.toString();
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean Initialization after the properties are set in the bean");
		
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroying the resource allocated to the bean object");
		
	}
	

}
