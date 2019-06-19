package com.wsc.Duck;

public class Duck implements Comparable {
   public String name="";
   public int weight=1;
   public Duck(String name,int weight) {
	   this.name=name;
	   this.weight=weight;
   }
   public String toString() {
	   return name+" weight:"+weight;
   }
@Override
public int compareTo(Object o) {
	Duck buf=(Duck)o;
	if(this.weight >buf.weight) {
		return 1;
	}else if(this.weight<buf.weight) {
		return -1;
	}
	return 0;
}
   
   
   
}
