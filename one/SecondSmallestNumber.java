package com.neha.gs.one;

public class SecondSmallestNumber {
	public static void main(String[] args) {
		//int[] arr = {1,2,3,4,5};
		//int[] arr = {12,13,1,10,34,1};
		int[] arr = {5,4,3,2,1};
		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<firstSmallest){
				secondSmallest=firstSmallest;
				firstSmallest=arr[i];
			}
			if(arr[i]!=firstSmallest && arr[i]<secondSmallest){
				secondSmallest=arr[i];
			}
		}
		
		System.out.println(secondSmallest);
		
	}

}
