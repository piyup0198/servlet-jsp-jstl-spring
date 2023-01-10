package com.training.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.spring.Car;
import com.training.spring.Employee;
import com.training.spring.Manager;
import com.training.spring.Person;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Person person() {
		com.training.spring.Person p = new Person(21);
		p.setFirstName("Kevin");
		p.setLastName("Peterson");
		return p;
		
	}
	
	@Bean
	public Car car() {
		Car c = new Car();
		c.setMake("Maruti");
		c.setModel("800");
		c.setYear(1990);
		return c;
	}
	
	
	@Bean
	public Employee employee() {
		com.training.spring.Employee e = new Employee();
		e.setName("Kevin");
		e.setDesig("Trainee");
		e.setSalay(5000);
		return e;
		
	}
	
	@Bean
	public Manager manager() {
		Manager m = new Manager();
		m.setmName("Mike");
		m.setSalary(10000);
		return m;
	}

}
