package com.learning.stringmutabilitydemo;

public class StringMutabilityDemo {

	public static void main(String[] args) {
		String s1=new String("Sample");
		String s2="new Sample";
		
		System.out.println(s1);
		//Every time String object is referred by new value
		//new object is created in memory
		//old value still exists in memory but not referred by string object
		//hence string objects are called as immutable
		s1=new String("Test");
		System.out.println(s1);
		
		System.out.println(s2);
		s2="Test2";
		System.out.println(s2);
		
	}

}
