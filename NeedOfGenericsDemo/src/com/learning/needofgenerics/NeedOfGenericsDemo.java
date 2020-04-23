package com.learning.needofgenerics;

public class NeedOfGenericsDemo {
	
	//we have to utilise two memory locations because of
	//different data types
	int num;
	double val;
	//if we use generic type then we can work with 
	//single variable and multiple data types
	
	
	public NeedOfGenericsDemo() {
		num=5;
		val=7.5;
	}
	
	void showVal()
	{
		System.out.println("Int value: "+num+" floating value: "+val);
	}
	public static void main(String[] args) {
		NeedOfGenericsDemo demo=new NeedOfGenericsDemo();
		demo.showVal();
	}

}
