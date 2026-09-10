package com.Searching;

public class first_Occurance {

	public static void main(String[] args) {
		int []arr= {1,2,2,2,2,2,2,2,2,2,3,4,5,5,5,7};
		int target=2;
		int left=0;
		int right=arr.length-1;
		int ans=-1;// if No index is match
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				ans=mid;
				right=mid-1;
			}
			else if(target<arr[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
			
		}
		System.out.println("First occurance is:"+ans);
	}

}
