package com.learning.finaldemo;

//anything declared as final can be accessed in child class
//but cannot be modified in child class

//if the class is declared as final 
//it cannot be inherited
 class DemoP {
	//if the variable is declared as final 
	//its value cannot be changed
	final int val=25;
	
	//if the method is declared as final 
	//it cannot be overridden in child class
	final void show()
	{
		System.out.println("hello from parent class");
	}
}

public class FinalDemo extends DemoP {

//	void show()
//	{
//		System.out.println("Hello");
//	}
	
	void disp()
	{
		//val=57;
		show();
		System.out.println("hello from child class"+val);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo finalDemo=new FinalDemo();
		finalDemo.disp();
	}

}
