package com.Arrays;

import java.util.*;
public class ThirdLargest_Element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of an Array");
		int n=sc.nextInt();
		
		System.out.println("Input array is: ");
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Now I find the largest , 2nd largest, 3rd largest : ");
		
		int largest=Integer.MIN_VALUE;
		int Slargest=Integer.MIN_VALUE;
		int Tlargest=Integer.MIN_VALUE;
		
		for(int current:arr) {
			
			// if dupicates allows skip them
			if(current==largest || current==Slargest || current==Tlargest) {
				continue;
			}
			
			if(current>largest) {
				Tlargest=Slargest;
				Slargest=largest;
				largest=current;
			}
			
			else if(current>Slargest) {
				Tlargest=Slargest;
				Slargest=current;
			}
			
			else if(current>Tlargest) {
				Tlargest=current;
			}
		}
		
		// if only 2 values as input then
		if(Tlargest==Integer.MIN_VALUE) {
			System.out.println("Third largest unquie element not exist");
		}else {
			System.out.println("Largest : "+largest);
			System.out.println("Second Largest : "+Slargest);
			System.out.println("Third Largest : "+Tlargest);
		}
		
		
			

	}

}
