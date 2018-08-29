package com.neha.gs.one;

import java.math.BigInteger;

public class FibonacciLargeNumber {

	public static void main(String[] args) {
		System.out.println(fibBig(12));
	}
	
	public static BigInteger fibBig(int n){
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(1);
		
		for(int i=2;i<=n;i++){
			c=a.add(b);
			a=b;
			b=c;
		}
		
		return c;
	}
	
}
