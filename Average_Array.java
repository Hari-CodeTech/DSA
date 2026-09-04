package com.Arrays;

public class Average_Array {

	public static void main(String[] args) {
		double arr[]= {10,20,30,405.563};
		double Avg=0.0;
		double sum=0.0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		Avg=sum/arr.length+1;
		System.out.println(Avg);
	}

}
