package com.neo.convert.model.internal;

public class ExchangeRates {
	private double exchangeRate;
	private String fromCurrencyCode;
	private String fromCurrencyName;
	private String toCurrencyCode;
	private String toCurrencyName;
	
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public String getFromCurrencyCode() {
		return fromCurrencyCode;
	}
	public void setFromCurrencyCode(String fromCurrencyCode) {
		this.fromCurrencyCode = fromCurrencyCode;
	}
	public String getFromCurrencyName() {
		return fromCurrencyName;
	}
	public void setFromCurrencyName(String fromCurrencyName) {
		this.fromCurrencyName = fromCurrencyName;
	}
	public String getToCurrencyCode() {
		return toCurrencyCode;
	}
	public void setToCurrencyCode(String toCurrencyCode) {
		this.toCurrencyCode = toCurrencyCode;
	}
	public String getToCurrencyName() {
		return toCurrencyName;
	}
	public void setToCurrencyName(String toCurrencyName) {
		this.toCurrencyName = toCurrencyName;
	}
	
}
