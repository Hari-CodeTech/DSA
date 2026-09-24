package com.Arrays;

import java.util.*;

public class All_Duplicates {
	public static int findduplicates(int arr[]) {
		HashSet<Integer> unquie=new HashSet<>();
		HashSet<Integer> duplicate=new HashSet<>();
		
		for(int num:arr) {
			if(unquie.contains(num)) {
				duplicate.add(num); 
			}
			
				unquie.add(num);
			
		}
		System.out.println("Unquie Set is : "+unquie);
		System.out.println("Duplicate Set is : "+duplicate);
		return -1;

	}
	public static void main(String[]args) {
		int arr[]= {1,2,3,4,5,61,2,3,6,78,65,44,54,45,44,0,1,-7,8};
		findduplicates(arr);
	}
	
}
