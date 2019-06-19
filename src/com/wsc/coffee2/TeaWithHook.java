package com.wsc.coffee2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TeaWithHook extends HotDrinkTemplate {

	@Override
	public void addCondimnets() {
		System.out.println("add lemo");
	}

	@Override
	public void brew() {
		System.out.println("brew tea");

	}
	
	public boolean wantCondimentsHook() {
		System.out.println("Condiments yes or no : ");
	    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    String result="";
	    try {
			result=in.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	   if(result.equals("n")) {
		   return false;
		   
	   }else {
		   return true;
	   }
	
	
	}

}
