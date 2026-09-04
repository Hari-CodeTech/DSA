package com.Arrays;

public class DeleteCase {

	public static void main(String[] args) {
		
		int arr[]= {12,23,56,32,34};
		int position=3;
		//new Array
		int newArr[]=new int[arr.length-1];
		//inserting values before position
		for(int i=0;i<position;i++) {
			newArr[i]=arr[i];
		}
		//Remaining values -->newarrays
		for(int i=position;i<newArr.length;i++) {
			newArr[i]=arr[i+1];
			
		}
		System.out.println("After deleteting specific position ");
		
		for(int x:newArr)
		{
			
		}
		

	}

}
