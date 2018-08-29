package com.neha.gs.one;

public class MaxContiniousRepeatingChar {
	
	public static void main(String[] args) {
		String s = "aaabbbacc"; 
		//"111000011";
longestUniformSub(s);
	}
	
	public static void longestUniformSub(String s){
		int maxFreq=0;
		char c='$';
		
		int currFreq=0;
		for(int i=0;i<s.length();i++){
			currFreq=1;
			while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
				currFreq++;
				i++;
			}
			if(maxFreq<currFreq){
				maxFreq=currFreq;
				c=s.charAt(i);
			}
		}
		System.out.println(maxFreq + " " + c);
	}

}
