package com.training.jsf.bean;

public class Student {

	private String usrClass;
	private String name;
	private int rollNo;
	private int age;
	/**
	 * @return the usrClas
	 */
	
	
	public String getUsrClass() {
		return usrClass;
	}
	public Student( String name,String usrClass, int rollNo, int age) {
		super();
		this.usrClass = usrClass;
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}
	/**
	 * @param usrClass the usrClass to set
	 */
	public void setUsrClass(String usrClass) {
		this.usrClass = usrClass;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
