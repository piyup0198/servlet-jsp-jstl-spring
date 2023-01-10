package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(com.training.spring.config.ApplicationConfig.class);
		
		//Person p1 = new Person;
		
		Person person1 = (Person)context.getBean("person");
		
		System.out.println("Name is: "+person1.getFirstName()+" "+person1.getLastName());
		System.out.println("Age of the person is: "+person1.getAge());
		System.out.println("Person Detail: "+person1.personDetail());
		
		//Person person2 = (Person)context.getBean("person");
		
		
		//person2.setFirstName("John");
		
		//System.out.println("Name is: "+person2.getFirstName());
	}

}
