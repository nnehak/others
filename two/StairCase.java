package com.neha.gs.two;

public class StairCase {
	
	//   ways(n) = ways(n-1) + ways(n-2)
	//ways(1) = fib(2) = 1 - There is only one way to climb 1 stair
	//	ways(2) = fib(3) = 2 - There are two ways: (1, 1) and (2)
	//ways(4) = fib(5) = 5 - (1, 1, 1, 1), (1, 1, 2), (2, 1, 1), (1, 2, 1), (2, 2)

	public static void main(String[] args) {
		int top = 4;
		int steps = 2;
		System.out.println(countWays(top+1, steps));
	}
	
	public static int countWays(int top, int steps){
		if(top<=1){
			return top;
		}
		int res=0;
		for(int i=1;i<=steps && i<=top;i++){
			res+=countWays(top-i, steps);
		}
		return res;
	}
}
