package com.neha.gs.two;

public class NumberOfContiniousSubArraySumLessthankK {
	public static void main(String[] args) {
		int arr[] = {2, 5, 6};
		int sum=10;
		System.out.println(countOrderN(arr, sum));
		System.out.println(countBruteForce(arr, sum));
	}

	/*Initially both start and end point to the beginning of the array, i.e. index 0. Now, let’s try to add a new element el.
	 *  There are two possible conditions.
	1st case :
	If sum is less than k, increment end by one position. So contiguous arrays this step produce are (end – start).
	 We also add el to previous sum. There are as many such arrays as the length of the window.
	2nd case :
	If sum becomes greater than or equal to k, this means we need to subtract starting element from sum so that the sum again becomes less than k. 
	So we adjust the window’s left border by incrementing start.
	We follow the same procedure until end < array size*/
	
	public static int countOrderN(int[] arr, int sum){
		int calcSum=arr[0];
		int count=0;
		int start=0, end=0;
		while(end<arr.length){
			if(calcSum<sum){
				end++;
				count += end-start;
				if(end<arr.length){
					calcSum+=arr[end];
				}
			}else{
				calcSum-=arr[start];
				start++;
			}
		}
		return count;
	}
	
	public static int countBruteForce(int[] arr, int sum){
		int count=0;
		for(int i=0;i<arr.length;i++){
			int calcSum=0;
			for(int j=i;j<arr.length;j++){
				if(calcSum+arr[j]<sum){
					count++;
					calcSum+=arr[j];
				}else{
					break;
				}
				
			}
		}
		return count;
	}
}


