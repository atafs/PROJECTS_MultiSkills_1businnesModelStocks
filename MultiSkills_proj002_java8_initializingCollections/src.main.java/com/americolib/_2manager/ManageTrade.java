/** 
*	@author AmericoTomas 
*	@mail atafs@iscte-iul.pt
*/

package com.americolib._2manager;

import java.util.ArrayList;
import java.util.HashMap;

import com.americolib._1model.impl.Stock;
import com.americolib._1model.impl.Trade;

public interface ManageTrade {

	//SIGNATURES
	public boolean recordTrade(Trade trade) throws Exception;
	public ArrayList<Trade> getTrades();
	public Stock getStockBySymbol(String stockSymbol);
	public HashMap<String, Stock> getStocks();

}


