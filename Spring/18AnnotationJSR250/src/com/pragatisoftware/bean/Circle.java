/**
 * 
 */
package com.pragatisoftware.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author Dhanashree.Dalave
 *
 */
public class Circle implements Shape {

	private Point center;

	/**
	 * 
	 */
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pragatisoftware.bean.Shape#draw()
	 */

	public Circle(Point center) {
		super();
		this.center = center;
	}

	public Point getCenter() {
		return center;
	}

	@Resource(name = "pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + "]";
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle is drawn with below center point:\n\n");
		System.out.println(this);
	}
	
	@PostConstruct
	public void initCircle() {
		System.out.println("init cicle");
	}
	@PreDestroy
	public void destroyCircle() {
		System.out.println("destroy cicle");
	}
}
