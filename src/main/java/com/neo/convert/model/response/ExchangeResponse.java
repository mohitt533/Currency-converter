package com.neo.convert.model.response;

public class ExchangeResponse {
	
	private String currencyCode;
	private String country;
	private float amount;
	private String convertionPath;
	
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getConvertionPath() {
		return convertionPath;
	}
	public void setConvertionPath(String convertionPath) {
		this.convertionPath = convertionPath;
	}
}
