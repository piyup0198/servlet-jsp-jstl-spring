package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int id;
	private String name;
	private String desig;
	private int salay;
	
	@Autowired
	private Manager manager;
	
	
	
	public Employee() {
		
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public int getSalay() {
		return salay;
	}
	public void setSalay(int salay) {
		this.salay = salay;
	}
	
	public String empDetails() {
		return name + " "+ desig + " "+ salay +" :" + manager.getManager();
	}

}
