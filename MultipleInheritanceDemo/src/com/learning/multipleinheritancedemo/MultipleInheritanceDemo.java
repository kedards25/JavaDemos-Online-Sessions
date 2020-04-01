package com.learning.multipleinheritancedemo;

//all the methods in an interface are public abstract by default
interface DemoP1 {
	DemoP1 demo=new MultipleInheritanceDemo();
	void show();
}

interface DemoP2 {
	DemoP2 demo2=new MultipleInheritanceDemo();
	void disp();
}


public class MultipleInheritanceDemo implements DemoP1,DemoP2 {

	//need to mention the access specifier as public 
	//as default access specifier for java classes is default
	@Override
	public void show()
	{
		System.out.println("Hello from overridden method");
	}
	
	
	@Override
	public void disp() {
		System.out.println("Hello from overridden method from DemoP2");
	}
	public static void main(String[] args) {
		
		demo.show();
		
		
		demo2.disp();
	}

}
