package com.Array_Problems;

public class FindMissingNumber {
	public static int FindMissNumber(int arr[],int n) {
		long expectedSum=(long)n *(n+1)/2;
		long actualSum=0;
		
		for(int num:arr) {
			actualSum+=num;
			
		}
		return (int)(expectedSum-actualSum); 
	}
	public static void main(String[]args) {
		int arr[]= {1,4,3,5,6};
		int n=6;
		System.out.println("Missing number is/: " + FindMissNumber(arr,n));
	}
}
