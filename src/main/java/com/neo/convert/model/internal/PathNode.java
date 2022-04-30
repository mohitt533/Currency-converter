package com.neo.convert.model.internal;

public class PathNode {
	private double amount;
	private String path;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public PathNode(double amount, String path) {
		super();
		this.amount = amount;
		this.path = path;
	}
	
	
}
