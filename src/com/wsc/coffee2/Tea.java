package com.wsc.coffee2;

public class Tea extends HotDrink {

	@Override
	public void brew() {
		System.out.println("brew tea");
		
	}

	@Override
	public void addCondiments() {
		System.out.println("add lemon");
		
	}
	

}
