package com.suresh.demos.items;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PriceManager {

	@Autowired @Qualifier("item2")
	private Priceable item;

	//setter based injection
	public void setItem(Priceable item) {
		this.item = item;
	}
	
	public double calculateItemPrice() {
		return item.calculatePrice();
	}
	
	
	
	
	
}
