package com.training.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="user")
@RequestScoped

public class User {
 
	private String userName;
	private String password;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	
	public String sayHi() {
		//if(userName == null || userName.equals("")) {
		if(userName.equals("abcd") && password.equals("abc1")) {
			return "success";
		}
		else {
			return "fail";
		}
	}
}
