package com.learning.anonymousclassesdemo;

public class AnonymousClassesDemo {
	
	int num=7;
	
	void showString()
	{
		//Anonymous object class from java.lang package
		Object object=new Object() {
			@Override
			public String toString() {
				//primitive data types cannot be converted to string 
				//by invoking to string method
				//for that we have to use method called as String.valueOf();
				return String.valueOf(num);
			}
		};
		System.out.println(object.toString());
	}
	
	public static void main(String[] args) {
		AnonymousClassesDemo anonymousClassesDemo=new AnonymousClassesDemo();
		anonymousClassesDemo.showString();
	}

}
