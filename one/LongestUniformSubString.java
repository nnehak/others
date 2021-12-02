package com.neha.gs.one;
////Longest uniform sub string  -input string = 10000111 - 1 0000 111 - start 1 end 4
///Input abbbccda, longest uniform sub string bbb, start at index 1 and its length is 3
public class LongestUniformSubString {
	public static void main(String[] args) {
		String s = "aaabbbacc"; 
				//"111000011";
		System.out.println(longestUniformSub(s).equals("0 3"));
		System.out.println(longestUniformSub("111000011").equals("3 4"));
		System.out.println(longestUniformSub("aabbbbbcdAA").equals("2 5"));
	}
	
	public static String longestUniformSub(String s){
		int maxFreq=0;
		int start=0;
		int end=0;
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
				start=i-maxFreq+1;
				end=i;
			}
		}
		return start + " " + maxFreq;
	}

}
