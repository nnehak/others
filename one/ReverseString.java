package com.neha.gs.one;

public class ReverseString {
	public static void main(String[] args) {
		 String st =""; 
				 //new String("Coding.is.a.super.fun");
		//Scanner sc = new Scanner(System.in);
		//int stringCount = sc.nextInt();
		//for (int i = 0; i < stringCount; i++) {
			//String st = sc.next();
			String[] words = st.split("\\."); //delimiter is .
			int mid = words.length / 2;
			for (int j = 0; j < mid; j++) {
				String tmp = words[j];
				words[j] = words[words.length - 1 - j];
				words[words.length - 1 - j] = tmp;
			}
			StringBuilder b = new StringBuilder();
			for (String s : words) {
				b.append(s);
				b.append(".");
			}
			System.out.println(b.toString().substring(0, b.toString().length()-1));
			b = new StringBuilder();
		//}
	}
}