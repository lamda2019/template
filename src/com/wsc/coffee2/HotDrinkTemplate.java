package com.wsc.coffee2;

public abstract class HotDrinkTemplate {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(wantCondimentsHook()) {
			addCondimnets();
		}else {
			System.out.println("No Condiments ");
		}
	}

	public abstract void addCondimnets();
	
	public boolean wantCondimentsHook() {
		return true;
	}

	public void pourInCup() {
		System.out.println("Pouring into cup");
	}

	public abstract void brew();

	public final void boilWater() {
		System.out.println("Boiling water");
	}
	
	
	
}