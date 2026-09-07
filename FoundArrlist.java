package com.Searching;

import java.util.Arrays;
import java.util.List;

public class FoundArrlist {

	public static void main(String[] args) {
		
		List<String>list=Arrays.asList("pen","paper","book","pencil");
		String target="book";
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(target))
			{
				System.out.println("Found String : "+i);
				return;
			}
		}
		System.out.println("No element found.......");

	}

}
