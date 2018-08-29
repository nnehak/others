package com.neha.gs.one;

public class PrimeFactors {
	
	public static void main(String[] args) {
		factorize(5);
	}
	
	public static void factorize(int n){
		StringBuilder sb = new StringBuilder();
		
		while(n%2==0){
			sb.append(2);
			sb.append(" ");
			n/=2;
		}
		
		for(int i=3;i<=Math.sqrt(n);i+=2){
			while(n%i==0){
				sb.append(i);
				sb.append(" ");
				n=n/i;
			}
		}
		
		if(n>2){
			sb.append(n);
		}
		
		System.out.println(sb.toString());
	}

}
