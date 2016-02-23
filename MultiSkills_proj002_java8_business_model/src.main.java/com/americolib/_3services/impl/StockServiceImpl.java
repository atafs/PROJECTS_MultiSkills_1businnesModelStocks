/** 
*	@author AmericoTomas 
*	@mail atafs@iscte-iul.pt
*/

package com.americolib._3services.impl;

import com.americolib._1model.impl.Trade;
import com.americolib._2manager.ManageTrade;
import com.americolib._3services.StockService;

public class StockServiceImpl implements StockService{

	//ATTRIBUTES
	private ManageTrade stocksEntityManager = null;

	//GETTER AND SETTER
	public ManageTrade getStocksEntityManager() {
		return stocksEntityManager;
	}
	public void setStocksEntityManager(ManageTrade stocksEntityManager) {
		this.stocksEntityManager = stocksEntityManager;
	}
	
	//INTERFACE
	public double calculateDividendYield(String stockSymbol) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public double calculatePERatio(String stockSymbol) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean recordTrade(Trade trade) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public double calculateStockPrice(String stockSymbol) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public double calculateGBCEAllShareIndex() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//ADDITIONAL METHODS
	

}


