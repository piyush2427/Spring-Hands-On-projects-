/**
 * 
 */
package com.tech.infrasoft.app;

/**
 * @author Piyush
 *
 */
public class Circle {
	Point center;
	int radius;
	
	public Circle(Point center, int radius) {
		super();
		this.center = center;
		this.radius = radius;
	}

	/**
	 * 
	 */
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [Center=" + center + ", radius=" + radius + "]";
	}
	

}
