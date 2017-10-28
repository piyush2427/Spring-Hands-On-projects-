/**
 * 
 */
package com.tech.infrasoft.util;

import java.util.List;

import com.pragatisoftware.bean.Employee;

/**
 * @author Piyush
 *
 */
public class EmployeeCollection {
	private List<Employee> emps;

	public EmployeeCollection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	
	public void listEmployees()
	{
		for(Employee emp:emps)
		{
			System.out.println(emp);
		}
	}

}
