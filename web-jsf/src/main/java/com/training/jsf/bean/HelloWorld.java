package com.training.jsf.bean;

import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="helloWorld")
@SessionScoped

public class HelloWorld {

	  private String value = "New Value";
	  public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getMessage() {
		  return "Hello World from Jsf...";
	  }
}


