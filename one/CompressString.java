package com.neha.gs.one;
//input aaabbbc out put a3b3c1
public class CompressString {
	//runlenght encoding
	public static void main(String[] args) {
		String input = "aaabbbc";
		System.out.println("a3b3c1".equals("aaabbbc"));
	}

	public static String compress(String input){
		int freqCount = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			freqCount = 1;
			while (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
				freqCount++;
				i++;
			}
			sb.append(input.charAt(i));
			sb.append(freqCount);
			freqCount = 1;

		}
		return sb.toString();
	}

}
