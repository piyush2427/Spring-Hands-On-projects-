/**
 * 
 */
package com.tech.infrasoft.bean;

/**
 * @author Piyush
 *
 */
public class Product {

	private int id;
	private String pname;
	private float price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String pname, float price) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", price=" + price + "]";
	}
	
	

}
