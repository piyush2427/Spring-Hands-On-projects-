/**
 * 
 */
package com.tech.infrasoft.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Piyush
 *
 */
public class UserBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("In After Initialization Bean is:"+beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("In Before Initialization Bean is:"+beanName);
		return bean;
	}

	public UserBeanPostProcessor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
