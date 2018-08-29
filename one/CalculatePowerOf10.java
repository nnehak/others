package com.neha.gs.one;

public class CalculatePowerOf10 {
	public static void main(String[] args) {
		System.out.println(kThpowerOfN(10, 3));
	}
	
	public static int kThpowerOfN(int n, int k){
		int pow =n;
		if(n==1 || k==1){
			return n;
		}
		for(int i =1; i <k;i++){
			pow*=n;
		}
		return pow;
	}

}
