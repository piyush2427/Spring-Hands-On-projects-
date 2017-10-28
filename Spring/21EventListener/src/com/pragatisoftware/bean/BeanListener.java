package com.pragatisoftware.bean;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class BeanListener implements ApplicationListener{

	public BeanListener() {
		// TODO Auto-generated constructor stub
	}

	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.toString());
	}

}
