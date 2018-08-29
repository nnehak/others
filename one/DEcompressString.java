package com.neha.gs.one;

public class DEcompressString {
	
	public static void main(String[] args) {
		String input ="a3b3c1";
		StringBuilder sb = new StringBuilder();
		if(input.length()%2 !=0){
			System.out.println("Invalid Input");
		}
		for(int i=0;i<input.length();i=i+2){
			char c = input.charAt(i);
			int val = input.charAt(i+1)-'0';
			for(int j = val;j>0;j--){
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}

}
