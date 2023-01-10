package com.training.web.model;

import java.sql.Date;

public class User {
	
	private String userName;
	private String password;
	private Date joining;
	public User() {
	
	}
	public User(String userName, String password , Date joining) {
		super();
		this.userName = userName;
		this.password = password;
		this.joining = joining;
	}
	public Date getJoining() {
		return joining;
	}
	public void setJoining(Date joining) {
		this.joining = joining;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
