package com.Searching;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[]arr= {1,2,3,5,6,7};
		int target=8;
		
		int left=0;
		int right=arr.length-1;
		
		int ans=arr.length;
		
		while(left<=right) {
			int mid=(left+right)/2;
			
			if(arr[mid]>=target)
			{
				ans=mid;
				right=mid-1;
			}
			else {
				left=mid+1;
				
			}
		}
		System.out.println("Insert position is:"+ans);
	}

}
