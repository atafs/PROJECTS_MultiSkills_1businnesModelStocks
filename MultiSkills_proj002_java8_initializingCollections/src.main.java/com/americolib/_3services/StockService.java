/** 
*	@author AmericoTomas 
*	@mail atafs@iscte-iul.pt
*/

package com.americolib._3services;

import com.americolib._1model.impl.Trade;

public interface StockService {

	//SIGNATURE
	public double calculateDividendYield(String stockSymbol) throws Exception;
	public double calculatePERatio(String stockSymbol) throws Exception;
	public boolean recordTrade(Trade trade) throws Exception;
	public double calculateStockPrice(String stockSymbol) throws Exception;
	public double calculateGBCEAllShareIndex() throws Exception;

}


