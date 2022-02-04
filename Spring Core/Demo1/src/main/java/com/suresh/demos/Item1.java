package com.suresh.demos;

public class Item1 implements Priceable {

		private double price;
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		public double calculatePrice() {
			return this.price;
		}
		
		
}
