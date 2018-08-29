package com.neha.gs.one;

import java.util.HashSet;

//uniquetupple - aaabbb (tupple of size 2)
//aa bb ab
//Please provide sample input and output and explain problem more
//How to implement solution

public class UniqueTupleTODO {

	//
	//fir in i =0 ; i<inpyt lenth - (k+1) ; i++
	//hasset.add input.substring(i, i+k)
	
	public static void main(String[] args) {
		uniqueTuple("aaabbb", 2);
	}
	
	public static void uniqueTuple(String in, int k){
		HashSet<String> s = new HashSet<String>();
		System.out.println(in.length()-k+1);
		for(int i=0;i<(in.length()- k+1);i++){
			s.add(in.substring(i, i+k));
		}
		System.out.println(s);
	}
}


//Longest uniform sub string  -input string = 10000111 - 1 0000 111 - start 1 end 4 
//Prime factorization - prime factors of number - 12 - 2 2 3
//reverse string
//