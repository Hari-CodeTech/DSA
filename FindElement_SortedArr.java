package com.Searching;

public class FindElement_SortedArr {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,7,8,9,10};
		int target=6;
		
		
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				found=true;
				
			}
			if(arr[i]>target) {
				break;
			}
			
		}
		System.out.println(found?"found the Element " + found:"Element Not found  "+ found);

	}

}
