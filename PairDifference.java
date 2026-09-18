package com.Map;

import java.util.*;

public class PairDifference {

	public static void main(String[] args) {
		int arr[]= {1,5,3,4,2};
		int k=2;
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			
			//1st: negitive direction
			
			if(map.containsKey(num-k))
			{
				System.out.println("pair found");
				System.out.println("indexes :"+map.get(num-k)+" "+i);
				System.out.println("values:"+(num-k)+" "+num);
				return;
			}
			
			// 2nd :posstive direction
			if(map.containsKey(num+k))
			{
				System.out.println("pair found");
				System.out.println("indexes :"+map.get(num+k)+" "+i);
				System.out.println("values:"+(num+k)+" "+num);
				return;
			}
			map.put(num,i);
			
		}
		
		System.out.println("no pair found");

	}

}
