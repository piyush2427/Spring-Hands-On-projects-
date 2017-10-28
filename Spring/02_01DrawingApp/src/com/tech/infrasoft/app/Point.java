/**
 * 
 */
package com.tech.infrasoft.app;//1

/**
 * @author Piyush
 *
 */
public class Point {//1
	int x;//1
	int y;//1
	
	public Point() {//2
		super();
		// TODO Auto-generated constructor stub
	}
	public Point(int x, int y) {//2
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {//1
		return x;
	}
	public void setX(int x) {//1
		this.x = x;
	}
	public int getY() {//1
		return y;
	}
	public void setY(int y) {//1
		this.y = y;
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";//1
	}
	
}
