package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       // ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(com.training.spring.config.ApplicationConfig.class);
		
		Employee employee1 = (Employee)context.getBean("employee");
		
		//System.out.println("Name is: "+employee1.getName());
	
		System.out.println("Employee Detail: "+employee1.empDetails());

	}

}
