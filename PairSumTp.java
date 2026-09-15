package com.TwoPointers;

public class PairSumTp {
	public static void paursumvals(int arr[],int target) {
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==target)
			{
				System.out.println("found pairs::"+arr[left]+" "+arr[right]);
				left++;
				right--;
			}else if(sum<target) {
				left++;
				
			}
			else {
				right--;
			}
		}
		
	}
	

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,8,9};
		int target=10;
		PairSumTp.paursumvals(arr, target);

	}

}
