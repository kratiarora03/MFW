package com.spring.core.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testclass {
	
	public static void main(String[] args) {
		
		
	ApplicationContext context  =new ClassPathXmlApplicationContext("com.spring.core.auto.wire.autowired.xml");
//	    Customer cus = context.getBean("customer" , Customer.class);
//	    System.out.println(cus);
	 
	 }
		
	}


