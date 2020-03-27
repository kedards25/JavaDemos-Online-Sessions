package com.learning.onstructor_invokation_inheritance;

class DemoP
{
	int num;
	
	DemoP()
	{
		num=6;
	}
	
	DemoP(int val)
	{
		num=val;
	}
	
	void show()
	{
		System.out.println("Values from parent: "+num);
	}
}

public class ConstructorInvokationInheritance extends DemoP {

	int number;
	
	//call to super class constructor is given by default in case of no-arg constructor
	ConstructorInvokationInheritance()
	{
		super();
		number=7;
	}

	
	ConstructorInvokationInheritance(int number,int x)
	{
		//call to the super has to be the first line in constructor invokation
		super(x);
		this.number=number;
		
	}

	void show()
	{
		super.show();
		System.out.println("Values from parent and child classes: "+number+" "+num);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Object created using no-arg constructor");
		ConstructorInvokationInheritance inheritance=new ConstructorInvokationInheritance();
		inheritance.show();
		//inheritance.show();
		
		System.out.println("\nObject created using parameterised constructor");
		ConstructorInvokationInheritance inheritance1=new ConstructorInvokationInheritance(5,7);
		//inheritance.disp();
		inheritance1.show();
	}

}
