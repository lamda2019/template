package com.wsc.coffee2;

public class Coffee extends HotDrink {
	


	@Override
	public void brew() {
		System.out.println("Brew Coffee");
		
	}

	@Override
	public void addCondiments() {
		System.out.println("add milk and suger");
		
	}

}
