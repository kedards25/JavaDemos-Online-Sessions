package com.learning.staticdemo;

public class StaticDemo {

	static int val;
	int num;
	

	//static methods cannot access non-static members 
	static void showMsg()
	{
		val=7;
		System.out.println("Hello from static method "+val);
	}
	
	//non-static methods can access static and non-static members both
	void dispNums()
	{
		val=5;
		num=7;
		System.out.println("Hello from non-static method "+val+" "+num);
	}
	public static void main(String[] args) {
		showMsg();
		StaticDemo demo=new StaticDemo();
		demo.dispNums();
	}

}
