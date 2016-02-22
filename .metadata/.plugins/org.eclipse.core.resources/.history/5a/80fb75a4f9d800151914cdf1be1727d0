package com.americolib.model;

import com.americolib.model.type.StockType;

//DAO
public class Stock {
	
	//ATTRIBUTES
	private String stockSymbol = null;
	private StockType stockType = StockType.COMMON; //default
	private double lastDividend = 0.0;
	private double fixedDividend = 0.0;
	private double parValue = 0.0;
	private double ticketPrice = 0.0;
	
	//CONSTRUCTOR
	public Stock() {
		super();
	}

	//GETTERS AND SETTERS
	public StockType getStockType() {
		return stockType;
	}

	public void setStockType(StockType stockType) {
		this.stockType = stockType;
	}

	public double getLastDividend() {
		return lastDividend;
	}

	public void setLastDividend(double lastDividend) {
		this.lastDividend = lastDividend;
	}

	public double getFixedDividend() {
		return fixedDividend;
	}

	public void setFixedDividend(double fixedDividend) {
		this.fixedDividend = fixedDividend;
	}

	public double getParValue() {
		return parValue;
	}

	public void setParValue(double parValue) {
		this.parValue = parValue;
	}

	public double getTickerPrice() {
		return ticketPrice;
	}

	public void setTickerPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	
	//METHODS
	/** PROCEDURE: print a message */
	public void stockData() {
		String toReturn = "";
		toReturn += "Stock stockSymbol = " + getStockSymbol() + "\n";
		toReturn += "\t=> Stock stockType = " + getStockType() + "\n";
		toReturn += "\t=> Stock lastDividend = " + getLastDividend() + "\n";
		toReturn += "\t=> Stock fixedDividend = " + getFixedDividend() + "\n";
		toReturn += "\t=> Stock parValue = " + getParValue() + "\n";
		toReturn += "\t=> Stock ticketPrice = " + getTickerPrice();
		
		System.out.println("");
		System.out.println("SPRING INJECTION ###############");
		System.out.println(toReturn);
	}
}
