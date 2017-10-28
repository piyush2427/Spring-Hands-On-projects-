/**
 * 
 */
package com.tech.infrasoft.app;//

/**
 * @author Piyush
 *
 */
public class Triangle {//1
	Point pointA;
	Point pointB;
	Point pointC;
	
	public Triangle() {//2
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(Point pointA, Point pointB, Point pointC) {//2
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}



	public Point getPointA() {//1
		return pointA;
	}

	public void setPointA(Point pointA) {//1
		this.pointA = pointA;
	}

	public Point getPointB() {//1
		return pointB;
	}

	public void setPointB(Point pointB) {//1
		this.pointB = pointB;
	}

	public Point getPointC() {//1
		return pointC;
	}

	public void setPointC(Point pointC) {//1
		this.pointC = pointC;
	}

	@Override
	public String toString() {//1
		return "Triangle [" + pointA + "," + pointB + "," + pointC + "]";
	}
	

}//1
