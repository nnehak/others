package com.neha.gs.two;

//https://www.geeksforgeeks.org/minimum-length-subarray-sum-greater-given-value/

public class ContiniousSubArrayExceedingSum {
	
	public static void main(String[] args) {
		int arr[] = {1, 4, 45, 6, 0, 19};
		int sum  =  51;
		
		int minLen=arr.length+1;
		
		int start=0, end=0, calcSum=0;
		Interval in=null;
		while(end<arr.length){
			while(end<arr.length && calcSum<=sum){
				calcSum+=arr[end++];
			}
			
			while(start<end && calcSum>sum){
				if(minLen>end-start){
					minLen=end-start;
					in = new Interval(start,end);
				}
				calcSum-=arr[start++];
			}
		}
		
		System.out.println(minLen);
		if(in!=null){
			for(int i=in.begin;i<in.end;i++){
				System.out.println(arr[i]);
			}
		}
		
	}

}


class Interval{
	int begin;
	int end;
	public Interval(int begin, int end){
		this.begin = begin;
		this.end=end;
	}
}