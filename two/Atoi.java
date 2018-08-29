package com.neha.gs.two;

//https://leetcode.com/problems/string-to-integer-atoi/description/
public class Atoi {
	public static void main(String[] args) {
		String in = "-91283472332";
		System.out.println(atoi(in));
	}
	
	public static int atoi(String s){
		double val =0;
		boolean positive=true;
		if(s==null || s.length()<=0){
			val=0;
		}
		
		int i =0;
		while(s.charAt(i)==' '){
			i++;
		}
		
		if(s.charAt(i)=='-'){
			positive = false;
			i++;
		}else if(s.charAt(i)=='+'){
			i++;
		}
		
		while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
			val*=10;
			val = val+s.charAt(i)-'0';
			i++;
		}
		if(!positive){
			val=-val;
		}
		
		if(val>Integer.MAX_VALUE){
			val = Integer.MAX_VALUE;
		}
		if(val<Integer.MIN_VALUE){
			val = Integer.MIN_VALUE;
		}
		return (int) val;
	}
}
