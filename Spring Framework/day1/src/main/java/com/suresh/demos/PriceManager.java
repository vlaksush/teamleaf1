package com.suresh.demos;

public class PriceManager {

	private Priceable item;

	public void setItem(Priceable item) {
		this.item = item;
	}
	
	public double calculateItemPrice() {
		return item.calculatePrice();
	}

	
	
	
}
