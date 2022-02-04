package com.suresh.demos.xml;

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
