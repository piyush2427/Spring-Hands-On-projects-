/**
 * 
 */
package com.tech.infrasoft.collectiondemo.util;

import java.util.List;

import com.tech.infrasoft.bean.Product;

/**
 * @author Piyush
 *
 */
public class ProductCollection {
	private List<Product> pro;

	public ProductCollection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Product> getPro() {
		return pro;
	}

	public void setPro(List<Product> pro) {
		this.pro = pro;
	}

	public void listProduct()
	{
		for(Product pros:pro)
		{
			System.out.println(pros);
		}
	}
	
	
	

}
