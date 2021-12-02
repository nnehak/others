package com.neha.gs.one;

public class SquareRoot {
	
	public static void main(String[] args) {
		System.out.println(root(100) == 10);
		System.out.println(root(4) == 2);
		System.out.println(root(2) == 1.41421);
	}

	public static double root(double num){

		double threshold=0.001;
		double rootV=num/2.0;
		for(int i=500;i>0 && Math.abs(rootV*rootV-num) > threshold;i--){
			rootV= rootV - ((rootV*rootV - num)/(2.0*rootV));
		}
		return rootV;
	}

}
