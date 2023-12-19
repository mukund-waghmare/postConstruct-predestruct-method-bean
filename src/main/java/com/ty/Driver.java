package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext contex=new ClassPathXmlApplicationContext("conf.xml");
		Student student=(Student)contex.getBean("student");
	   contex.close();
		
	}
}
