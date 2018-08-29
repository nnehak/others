package com.neha.gs.one;

import java.util.HashMap;

//https://www.geeksforgeeks.org/count-pairs-with-given-sum/
public class TwoSumCount {
	public static void main(String[] args) {
		int[] in = {2,7,11,15};
		int target =9;
		System.out.println(pairCount(in, target));
	}
	
	public static int pairCount(int[] in, int target){
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		int count=0;
		for(int i=0;i<in.length;i++){
			map.put(in[i],0);
		}
		
		for(int i=0;i<in.length;i++){
			if(map.containsKey(target - in[i])){
				count++;
			}
		}
		
		return count/2;
	}

}
