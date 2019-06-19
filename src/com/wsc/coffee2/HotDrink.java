package com.wsc.coffee2;

public abstract class HotDrink {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	public abstract void brew();
	public abstract void addCondiments();
	
	
	
	public final void boilWater() {
		System.out.println("Boiling water");
	}
	
	public final void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
