package com.learning.methodlocal_innerclass;

public class MethodLocalInnerClassDemo {

	private int val=9;
	
	//class created within a method
	void createClass()
	{
		class DemoC{
			void showVal()
			{
				System.out.println("Private value from parent "+val);
			}
		}
		DemoC demoC=new DemoC();
		demoC.showVal();
	}
	
	
	public static void main(String[] args) {
		MethodLocalInnerClassDemo demo=new MethodLocalInnerClassDemo();
		demo.createClass();

	}

}
