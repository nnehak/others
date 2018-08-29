package com.neha.gs.two;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/number-subarrays-product-less-k/
public class CountSubArrayProductLessThanK {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer> ();
	    al.add(1);
	    al.add(2);
	    al.add(3);
	    al.add(4);
	    Integer[] arr = new Integer[al.size()];
	    arr = al.toArray(arr);
	    System.out.println(
	    		countSubArr(arr, 10));
	}
	
	public static int countSubArr(Integer[] arr, long k){
		int n = arr.length;
		long p = 1;
		int res = 0;
		for(int start=0, end =0; end<n;end++){
			p*=arr[end];
			while(start<end && p>=k){
				p/=arr[start++];
			}
			if(p<k){
				int len = end - start+1;
				res+=len;
			}
		}
		return res;
	}

}
