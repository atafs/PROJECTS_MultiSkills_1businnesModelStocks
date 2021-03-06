/** 
*	@author AmericoTomas 
*	@mail atafs@iscte-iul.pt
*/

package com.americolib._2manager.impl;

import java.util.ArrayList;
import java.util.HashMap;

import com.americolib._1model.impl.Stock;
import com.americolib._1model.impl.Trade;
import com.americolib._2manager.ManageTrade;

public class ManageTradeImpl implements ManageTrade{

	//ATTRIBUTES
	private HashMap<String, Stock> stocks = null;
	private ArrayList<Trade> trades = null;

	//CONSTRUCTOR
	public ManageTradeImpl() {
		trades = new ArrayList<Trade>();
		stocks = new HashMap<String, Stock>();
	}
	
	//GETTERS AND SETTERS
	public ArrayList<Trade> getTrades() {
		return trades;
	}
	
	public void setTrades(ArrayList<Trade> trades) {
		this.trades = trades;
	}
	
	public HashMap<String, Stock> getStocks() {
		return stocks;
	}
	
	public void setStocks(HashMap<String, Stock> stocks) {
		this.stocks = stocks;
	}
	
	//ADDITIONAL METHODS
	public boolean recordTrade(Trade trade) throws Exception {
		boolean result = false;
		try{
			result = trades.add(trade);
		}catch(Exception exception){
			throw new Exception("ERROR IN THE MANAGER OF THE APP FOR TRADES", exception);
		}
		return result;
	}

	public Stock getStockBySymbol(String stockSymbol) {
		Stock stock = null;
		try{
			if(stockSymbol!=null){
				stock = stocks.get(stockSymbol);
			}
		}catch(Exception exception){
			System.err.println("An error has occurred recovering the stock object for the stock symbol: "+stockSymbol);
			exception.printStackTrace();
		}
		return stock;
	}



}


