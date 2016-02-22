package com.americolib.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.americolib.model.Stock;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//CONFIG
		ApplicationContext context = new ClassPathXmlApplicationContext("com/americolib/config/spring.xml");
		
		//INSTANTIATE
		Stock stock1 = (Stock)context.getBean("stockTEA");
		Stock stock2 = (Stock)context.getBean("stockALE");
		Stock stock3 = (Stock)context.getBean("stockGIN");
		Stock stock4 = (Stock)context.getBean("stockJOE");
		
		//PRINT IN CONSOLE
		stock1.stockData();
		stock2.stockData();
		stock3.stockData();
		stock4.stockData();
	}

}
