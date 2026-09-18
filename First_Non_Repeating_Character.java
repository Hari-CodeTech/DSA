package com.Map;

import java.util.*;
public class First_Non_Repeating_Character {

	public static void main(String[] args) {
		String s="aabbcdde";
		
		HashMap<Character , Integer>map=new HashMap<>();
		//1.Count frequency
		for(char ch:s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(int i=0;i<s.length();i++)
		{
			if(map.get(s.charAt(i))==1)
			{
				System.out.println("index : "+i);
				return;
			}
		}
		System.out.println("Not found");

	}

}
