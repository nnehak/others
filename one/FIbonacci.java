package com.neha.gs.one;

public class FIbonacci {
	public static void main(String[] args) {
		System.out.println(nThFibonacci(12));
	}
	
	public static int nThFibonacci(int n){
		if(n<0){
			System.out.println("incorrect input");
			return -1;
		}
		if(n==0 || n==1){
			return n;
		}
		
		return(nThFibonacci(n-1)+nThFibonacci(n-2));
	}

}
