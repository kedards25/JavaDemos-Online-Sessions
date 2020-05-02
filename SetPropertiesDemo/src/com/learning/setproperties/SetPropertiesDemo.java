package com.learning.setproperties;

import java.util.*;


public class SetPropertiesDemo {

	public static void main(String[] args) {
//		Set<String> demoSet=new TreeSet();
		
		Set demoSet=new HashSet();
		demoSet.add("One");
		demoSet.add(15);
		demoSet.add('K');
		demoSet.add(5.4);
		demoSet.add("Four");
		
//		System.out.println(demoSet.size());
//		System.out.println(demoSet.remove("Umbrella"));
//		System.out.println(demoSet.size());
		
//		System.out.println(demoSet.size());
//		demoSet.clear();
//		System.out.println(demoSet.size());
		
		Iterator iterator=demoSet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
