package com.neha.gs.two;

import java.util.ArrayList;
import java.util.Arrays;

public class StairCaseOther {
	//given n number of steps
	//return number of unique combination to climb the stairs
	//   111
	//   21
	//   12
	//   3

	public static void main(String[] args) {
		int top = 4;
		int steps = 2;
		System.out.println(countWays(4) == 7);
		System.out.println(countWays(3) == 4);
		System.out.println(countWays(-5) == 0);
		System.out.println(countWays(10) == 274);
	}
	
	public static int countWaysRec(int n){
		if ( n<=0) return 0;
		return countWays(n);
	}

	public static int countWays(int n){
		if (n<=0) return 0;
		if (n==1) return 1;
		if (n==2) return 2;
		if (n==3) return 4;

		ArrayList<Integer> counts = new ArrayList<>(Arrays.asList(0,1,2,4));
		for(int i=4;i<=n;++i){
		counts.add(counts.get(i-1) + counts.get(i-2) + counts.get(i-3));
		}
		return counts.get(n);
	}
}
