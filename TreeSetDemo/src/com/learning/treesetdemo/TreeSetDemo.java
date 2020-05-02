package com.learning.treesetdemo;

import java.util.*;


public class TreeSetDemo {

	
	public static void main(String[] args) {
		Set<String> demoSet=new TreeSet();
		
		demoSet.add("One");
		demoSet.add("Two");
		demoSet.add("Three");
		demoSet.add("Umbrella");
		demoSet.add("Four");
		
		Iterator iterator=demoSet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
//		for (String num : demoSet) {
//			System.out.println(num);
//		}

	}

}
