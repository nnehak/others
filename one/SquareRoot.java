package com.neha.gs.one;

public class SquareRoot {
	
	public static void main(String[] args) {
		int num=141;
		
		double root=1;
		for(int i=1;i<num/2;i++){
			root=(root+num/root)*.5;
		}
		System.out.println(root);
		
	}

}
