package com.test.web.model;

public class ElectricityUser {
	private int meterId;
	private String ConsName;
	private int currReading;
	private int prevReading;
	private String zone;
	
	
	public ElectricityUser(int meterId, String consName, int currReading, int prevReading, String zone) {
		super();
		this.meterId = meterId;
		this.ConsName = consName;
		this.currReading = currReading;
		this.prevReading = prevReading;
		this.zone = zone;
	}
	public int getMeterId() {
		return meterId;
	}
	public void setMeterId(int meterId) {
		this.meterId = meterId;
	}
	public String getConsName() {
		return ConsName;
	}
	public void setConsName(String consName) {
		ConsName = consName;
	}
	public int getCurrReading() {
		return currReading;
	}
	public void setCurrReading(int currReading) {
		this.currReading = currReading;
	}
	public int getPrevReading() {
		return prevReading;
	}
	public void setPrevReading(int prevReading) {
		this.prevReading = prevReading;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}

}
