package com.assignment10q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxStringLength {
	public static void main(String args[]) {
		
//		Create a list of strings. Find the string with highest length using Collections.max().
		List<String> lString = new ArrayList<>();
		lString.add("nishant");//7
		lString.add("saurabh");//7
		lString.add("amansssssss");//11
		lString.add("kunal");//5
		lString.add("someshssss");//10
		lString.add("tishabh");//7
		
		class StringComparator implements Comparator<String>{
			
			public int compare(String s1,String s2) {
				int diff= s1.length() - s2.length();
				return diff;
				
			}
			
		}
		StringComparator cmp = new StringComparator();
		
		
		System.out.println(Collections.max(lString,cmp));
//		System.out.println(Collections.max(lString));
		
		
		
	}

}
