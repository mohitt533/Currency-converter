package com.neo.convert.model.internal;

public class PriorityNode {
	private double amount;
	private String countryCode;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public PriorityNode(String countryCode,double amount) {
		super();
		this.amount = amount;
		this.countryCode = countryCode;
	}
	
}
