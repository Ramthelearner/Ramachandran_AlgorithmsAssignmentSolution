package com.greatlearning.stockers.model;

public class Stock {
	private int comapanyNo;
	private double stockPrice;
	private boolean stockPriceStatus;

	// Return the No of companies
	public int getComapanyNo() {
		return comapanyNo;
	}

	// Return the stock price value of company
	public double getStockPrice() {
		return stockPrice;
	}

	// Return the status of stock price
	public boolean isStockPriceStatus() {
		return stockPriceStatus;
	}

	// Initialize each object with values of No of company, stock price , stock price status
	public Stock(int comapanyNo, double stockPrice, boolean stockPriceStatus) {
		super();
		this.comapanyNo = comapanyNo;
		this.stockPrice = stockPrice;
		this.stockPriceStatus = stockPriceStatus;
	}

}
