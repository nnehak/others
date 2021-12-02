package com.neha.gs.two;

//https://leetcode.com/problems/string-to-integer-atoi/description/
public class Atoi {
	public static void main(String[] args) {
		boolean result = true;
		result = result && atoi("0") == 0;
		result = result && atoi("123") == 123;
		result = result && atoi("1") == 1;
		result = result && atoi("-1") == -1;
		result = result && atoi("-123") == -123;
		result = result && atoi("123a") == 123;
		result = result && atoi("a") == 0;
		System.out.println(result);
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
