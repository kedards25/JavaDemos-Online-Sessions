package com.learning.objectcastingdemo;

class DemoP {
	void show()
	{
		System.out.println("From Parent class");
	}
}

public class ObjectCastingDemo extends DemoP{
	
	void disp()
	{
		System.out.println("From child class");
	}

	public static void main(String[] args) {
		DemoP dp=new DemoP();
		
		//implicit object casting 
		//DemoP demo=new ObjectCastingDemo();
		//demo.show();
		
		//Parent object cannot be assigned to child object
		//hence we need to cast it to child
		//in this case object casting compiles successfully 
		//but throws runtime error as parent object cannot be casted to child
		ObjectCastingDemo demo=(ObjectCastingDemo)dp;
		demo.disp();
	}

}
