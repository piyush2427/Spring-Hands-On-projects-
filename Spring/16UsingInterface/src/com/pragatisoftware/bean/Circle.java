/**
 * 
 */
package com.pragatisoftware.bean;

import org.springframework.beans.factory.annotation.Required;

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

	/* (non-Javadoc)
	 * @see com.pragatisoftware.bean.Shape#draw()
	 */
	
	public Circle(Point center) {
		super();
		this.center = center;
	}

	public Point getCenter() {
		return center;
	}
	@Required
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

}
