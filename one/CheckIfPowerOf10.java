package com.neha.gs.one;

public class CheckIfPowerOf10 {
	
	public static void main(String[] args) {
		
		int x=10;
		int y =1000;
		System.out.println(powerOf10(x, y));
	}
	
	public static boolean powerOf10(int x, int y){
		if(x==1 && y==1){
			return true;
		}
		
		int pow =x;
		while(pow<y){
			pow *=x;
		}
		if(pow == y){
			return true;
		}
		return false;
	}

}
