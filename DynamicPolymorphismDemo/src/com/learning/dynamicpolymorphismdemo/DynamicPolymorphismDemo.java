package com.learning.dynamicpolymorphismdemo;

class DemoP
{
	void show(double num)
	{
		System.out.println("Hello From parent");
	}
}

public class DynamicPolymorphismDemo extends DemoP{

	
	void show(double val)
	{
		System.out.println("Hello From child");
	}
	
	public static void main(String[] args) {
		DemoP dp=new DemoP();
		//dp.show();

		DynamicPolymorphismDemo demo=new DynamicPolymorphismDemo();
		//demo.show();
		
		
		//Object of child being assigned to parent
		//as same as this=>
		DemoP d=new DynamicPolymorphismDemo();
		//DemoP d=demo;
		d.show(5.7);
	}

}
