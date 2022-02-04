package com.suresh.demos.java.way1;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class PriceManager {

	
	private Priceable item;

	//setter based injection
	public void setItem(Priceable item) {
		this.item = item;
	}
	
	public double calculateItemPrice() {
		return item.calculatePrice();
	}
	
	
	
	
	
}
