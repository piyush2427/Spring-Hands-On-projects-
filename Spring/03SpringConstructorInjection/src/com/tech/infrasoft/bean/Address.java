/**
 * 
 */
package com.tech.infrasoft.bean;

/**
 * @author Piyush
 *
 */
public class Address {
	private String City;
	private String State;
	private String Country;
	
	
	/**
	 * 
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param city
	 * @param state
	 * @param country
	 */
	public Address(String city, String state, String country) {
		super();
		City = city;
		State = state;
		Country = country;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	public String getCountry() {
		return Country;
	}


	public void setCountry(String country) {
		Country = country;
	}


	@Override
	public String toString() {
		return "Address [EmpCity=" + City + ", EmpState=" + State + ", EmpCountry=" + Country + "]";
	}

	
	
}
