package com.Searching;

public class FindFirstEvenNumber {

	public static void main(String[] args) {
		int arr[]= {1,5,42,2,3,44,60,98,4};
		
		for(int num:arr) {
			if(num%2==0) {
				System.out.println("Found even number:"+num);
				return;
			}
		}
		System.out.println("No element found");

	}

}//ArrayList<String> li= Array.asList("pen","paper","book","pencil");
//target=book
