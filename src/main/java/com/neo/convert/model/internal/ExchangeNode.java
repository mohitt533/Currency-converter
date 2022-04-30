package com.neo.convert.model.internal;

public class ExchangeNode {
	private String countryCode;
	private double exchangeRate;
	
	public ExchangeNode(String countryCode, double exchangeRate) {
		super();
		this.countryCode = countryCode;
		this.exchangeRate = exchangeRate;
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
}
