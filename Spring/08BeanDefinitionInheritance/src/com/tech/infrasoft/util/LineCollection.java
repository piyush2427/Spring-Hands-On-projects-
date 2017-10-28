/**
 * 
 */
package com.tech.infrasoft.util;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.tech.infrasoft.bean.Line;


/**
 * @author Piyush
 *
 */
public class LineCollection implements InitializingBean,DisposableBean {

	private List<Line> line;

	public LineCollection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Line> getLine() {
		return line;
	}

	public void setLine(List<Line> line) {
		this.line = line;
	}
	
	public void listLine()
	{
		for(Line lines:line)
		{
			System.out.println(lines);
		}
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroyed");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initialized");
		
		
	}
	
}
