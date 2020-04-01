package com.learning.multiLeveIinheritancedemo;

interface DemoP1 {
	void show();
}

interface DemoP2 extends DemoP1 {
	int NUM=5;
}

public class MultiLeveInheritanceDemo implements DemoP2 {

	public void show()
	{
		System.out.println("Value from DemoP2: "+NUM);
	}
	
	public static void main(String[] args) {
		DemoP2 demoP2=new MultiLeveInheritanceDemo();
		demoP2.show();

	}

}
