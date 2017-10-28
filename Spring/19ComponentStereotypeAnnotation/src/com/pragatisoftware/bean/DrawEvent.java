package com.pragatisoftware.bean;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent {

	// public DrawEvent() {
	// // TODO Auto-generated constructor stub
	//
	// }

	public DrawEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Draw event occured";
	}

}
