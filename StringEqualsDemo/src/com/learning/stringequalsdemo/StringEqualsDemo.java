package com.learning.stringequalsdemo;

public class StringEqualsDemo {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		if (s1.equals(s2)) {
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
		
		if(s1==s2)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}

	}

}
