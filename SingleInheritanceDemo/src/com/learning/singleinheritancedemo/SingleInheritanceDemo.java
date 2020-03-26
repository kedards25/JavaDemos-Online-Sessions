package com.learning.singleinheritancedemo;

class DemoP {
	protected int value=7;
}
//child class can access only non-private members of parent class
public class SingleInheritanceDemo extends DemoP {

	void showValue()
	{
	
		System.out.println(value);
	}
	public static void main(String[] args) {
		SingleInheritanceDemo singleInheritanceDemo=new SingleInheritanceDemo();
		singleInheritanceDemo.showValue();
	}

}
