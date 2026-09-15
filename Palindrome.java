package com.TwoPointers;

public class Palindrome {
	
	public static void isPalind(String s) {
		int left=0;
		int right=s.length()-1;
		
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right))
			{
				System.out.println("Not plaindrome");
				return;
				
			}
			left++;
			right--;
		}
		System.out.println("IsPalindrome");
		
	}

	public static void main(String[] args) {
		String s="LeveL";
		Palindrome.isPalind(s);

	}

}
