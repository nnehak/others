package com.neha.gs.one;

//https://www.geeksforgeeks.org/program-to-add-two-fractions/

public class AddFraction {
	
	public static void main(String[] args) {
		fraSum(1, 500, 2, 1500);
	}
	
	public static void fraSum(int num1, int den1, int num2, int den2){
		int commonden= den1*den2;
		int num3 = num1*den2 + num2*den1;
		int gcf = gcf(num3, commonden);
		num3 = num3/gcf;
		commonden=commonden/gcf;
		System.out.println(num3 + "/" + commonden);
	}
	
	public static int gcf(int i, int j){
		int gcfRet = 1;
		
		for(int gcf =1; gcf<=i && gcf<=j;gcf++){
			if(i%gcf==0 && j%gcf==0){
				gcfRet = gcf;
			}
		}
		return gcfRet;
	}

}
