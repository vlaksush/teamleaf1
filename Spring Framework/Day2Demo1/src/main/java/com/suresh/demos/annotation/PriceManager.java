package com.suresh.demos.annotation;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Named
public class PriceManager {

	@Autowired
	@Qualifier("bbb")
	private Priceable item;

	//setter based injection
	public void setItem(Priceable item) {
		this.item = item;
	}
	
	public double calculateItemPrice() {
		return item.calculatePrice();
	}
	
	
	
	
	
}
