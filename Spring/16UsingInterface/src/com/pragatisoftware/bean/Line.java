/**
 * 
 */
package com.pragatisoftware.bean;

/**
 * @author Dhanashree.Dalave
 *
 */
public class Line implements Shape{

	private Point pointA;
	private Point pointB;
	/**
	 * 
	 */
	public Line() {
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
		return "Line [pointA=" + pointA + ", pointB=" + pointB + "]";
	}
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Line Is drawn with below points :\n\n");
		System.out.println(this);
	}
	
}
