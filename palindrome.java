package com.Standard_Problems;

public class palindrome {

	public static void main(String[] args) {
		int num=121;
		int temp=num;
		int rev=0;
		
		while(num>0) {
		int digit=num%10;
		rev=rev*10+digit;
		num=num/10;
		}
		if(temp==rev) {
			System.out.println("Is palindrome");
	
		}
		else {
			System.out.println("Not a palindrome");
		}
		
		
	}

}
