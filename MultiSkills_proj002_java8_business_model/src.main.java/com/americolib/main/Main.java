package com.americolib.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.americolib._1model.impl.Stock;
import com.americolib._1model.impl.Trade;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//CONFIG
		ApplicationContext context = new ClassPathXmlApplicationContext("com/americolib/config/beans-1inject-services-context.xml");
		ApplicationContext contextTrade = new ClassPathXmlApplicationContext("com/americolib/config/beans-2list-services-context.xml");

		
		//INSTANTIATE *************************************
		Stock stock1 = (Stock)context.getBean("stockTEA");
		Stock stock2 = (Stock)context.getBean("stockALE");
		Stock stock3 = (Stock)context.getBean("stockGIN");
		Stock stock4 = (Stock)context.getBean("stockJOE");
		
		//PRINT IN CONSOLE
		stock1.stockData();
		stock2.stockData();
		stock3.stockData();
		stock4.stockData();
		
		@SuppressWarnings("unchecked")
		List<Trade> trades = (ArrayList<Trade>)contextTrade.getBean("tradeList");
		for (Trade trade : trades) {
			trade.toString();
		}
	}

}
