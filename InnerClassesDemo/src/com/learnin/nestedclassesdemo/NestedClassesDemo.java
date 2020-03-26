package com.learnin.nestedclassesdemo;

public class NestedClassesDemo {
	private int NUM=5;
	
	class DemoC
	{
		void showVal() {
			System.out.println("Value from parent class: "+NUM);
		}
	}
	
	DemoC dc=new DemoC();
	void disp()
	{
		dc.showVal();
	}
	public static void main(String[] args) {
		NestedClassesDemo demo=new NestedClassesDemo();
		demo.disp();
	}

}
