package com.training.spring;

public class Manager {
	
	private String mName;
	private int salary;
	
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	 public String getManager() {
		 return "Manager's name is: "+mName +" : "+"Salary is: "+ salary;
	 }

}
