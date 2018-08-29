package com.neha.gs.one;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
	
	public static void main(String[] args) {
		String input = "geeksforgeeks";
		System.out.println(firstNon(input));
	}
	
	public static Character firstNon(String input){
		if(input==null || input.length()==0){
			return 0;
		}
		char[] in = input.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<in.length;i++){
			if(map.containsKey(in[i])){
				map.put(in[i], map.get(in[i])+1);
			}else{
				map.put(in[i], 1);
			}
		}
		
		for(int i=0;i<input.length();i++){
			if(map.get(input.charAt(i))==1){
				return input.charAt(i);
			}
		}
		return 0;
	}

}
