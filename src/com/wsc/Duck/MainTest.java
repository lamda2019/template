package com.wsc.Duck;

import java.util.Arrays;

public class MainTest {

	public static void main(String[] args) {
		Duck[] ducks= {
				new Duck("Duck1",(int)(Math.random()*100)),
				new Duck("Duck2",(int)(Math.random()*100)),
				new Duck("Duck3",(int)(Math.random()*100)),
				new Duck("Duck4",(int)(Math.random()*100)),
				new Duck("Duck5",(int)(Math.random()*100)),
				new Duck("Duck6",(int)(Math.random()*100)),
				new Duck("Duck7",(int)(Math.random()*100)),
				new Duck("Duck8",(int)(Math.random()*100)),
				new Duck("Duck9",(int)(Math.random()*100))
		};
		System.out.println("before sort:");
		display(ducks);
		Arrays.sort(ducks);
		System.out.println("after sort");
		display(ducks);
		
	}

	private static void display(Duck[] ducks) {
		for(int i=0;i<ducks.length;i++) {
			System.out.println(ducks[i].name+" weight: "+ducks[i].weight);
		}
		
	}

}
