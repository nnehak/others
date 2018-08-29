package com.neha.gs.two;

import java.util.Arrays;

public class MedianTwoArray {
	public static void main(String[] args) {
		int[] arr1={}; //{1,2,3}; //{5,8,10,20};
		int[] arr2 ={1,2,3}; //{1,2,3}; //{900};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int[] arr3 = merge(arr1, arr2, arr1.length, arr2.length);
		for(int  i = 0 ; i<arr3.length;i++){
			System.out.println(arr3[i]);
		}
		System.out.println(median(arr3));
	}
	
	public static int[] merge(int[] arr1,int[] arr2,int size1, int size2){
		int[] arr3 = new int[size1+size2];
		int i=0,j=0,k=0;
		
		while(i<size1 && j< size2){
			if(arr1[i]<arr2[j]){
				arr3[k++]=arr1[i++];
			}else
			if(arr1[i]>arr2[j]){
				arr3[k++]=arr2[j++];
			}else if(arr1[i]==arr2[j]){
				arr3[k++]=arr1[i++];
				arr3[k++]=arr2[j++];
			}
		}
		
		while(i<size1){
			arr3[k++]=arr1[i++];
		}
		
		while(j<size2){
			arr3[k++]=arr2[j++];
		}
		return arr3;
	}
	
	public static double median(int[] in){
		double med =0;
		if(in.length<=0){
			return 0;
		}
		if(in.length%2==0){
			med = in[in.length/2-1]+in[in.length/2];
			med=med/2;
		}else{
			med=in[in.length/2];
		}
		return med;
	}

}
