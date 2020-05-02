package com.learning.hashsetdemo;


import java.util.*;


public class HashSetDemo {

	public static void main(String[] args) {
		//We are creating object of interface and assigning it with
		//child class in order to hide implementation of child class
		//and to impose abstraction and encapsulation
		Set<String> demoSet=new HashSet<String>();
		
		demoSet.add("One");
		demoSet.add("Two");
		demoSet.add("Three");
		demoSet.add("Umbrella");
		demoSet.add("Four");
		
		//HashSet has quick performance than treeset because
		//it does not sort the values
		Iterator iterator=demoSet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
