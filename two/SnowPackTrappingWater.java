package com.neha.gs.two;

//please confirm the problem statement
//please give sample input and output
//how to implement
//same 

//https://www.geeksforgeeks.org/trapping-rain-water/
public class SnowPackTrappingWater {

	public static void main(String[] args) {
		int arr[]   = {1,0,0,0,0,0,0,0,0,0,0,1};//{0,1,3,0,1,2,0,4,2,0,3,0}; 
			//{2,0,2};
		System.out.println(maxWater(arr));
	}
	
	public static int maxWater(int[] arr){
		if(arr==null || arr.length<=0){
			return 0;
		}
		int n = arr.length;
		int[] maxL= new int[arr.length];
		int[] maxR=new int[arr.length];
		
		maxL[0]=arr[0];
		for(int i=1;i<arr.length;i++){
			maxL[i]=Math.max(arr[i], maxL[i-1]);
		}
		
		maxR[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--){
			maxR[i]=Math.max(arr[i],maxR[i+1]);
		}
		
		int water=0;
		for(int i=0;i<n;i++){
			water+=Math.abs(Math.min(maxL[i], maxR[i])-arr[i]);
		}
		return water;
	}
	
}
