package com.Array_Problems;

import java.util.HashSet;

public class FirstDuplicateElement {
	public static int FindDupilcate(int arr[]) {
		HashSet <Integer> set=new HashSet<>();
		
		for(int num:arr) {
			if(set.contains(num)) {
				return num;
			}
			
			set.add(num);
			
		}
		return -1;
		
	}
	public static void main(String[]args) {
		int arr[]= {1,2,3,5,3,4,5};
		System.out.println(FindDupilcate(arr));
	}

}
