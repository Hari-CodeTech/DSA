package com.Searching;

public class FindNameInStringArray {

	public static void main(String[] args) {
		String arr[]= {"Hari","Satya","Sai","Arjun","Ravi","ram","Kavya","Sangamithra"};
		String target="Kavya";
		
		boolean found=false;
		
		for(String str:arr) {
			if(str.equals(target)) {
				found=true;
				break;
			}
		}
		System.out.println(found?"Present": "Not present");

	}

}
