package com.learning.nestedclassesdemo;



public class NestedClassesDemo {
private static int NUM=5;
	
	static class DemoC
	{
		static void showVal() {
			System.out.println("Value from parent class: "+NUM);
		}
	}
	
	//DemoC dc=new DemoC();
	void disp()
	{
		//method is declared as static 
		//hence can be invoked using class name
		DemoC.showVal();
	}
	public static void main(String[] args) {
		NestedClassesDemo demo=new NestedClassesDemo();
		demo.disp();
	}
}
