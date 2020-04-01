package com.learning.extendsimplementsdemo;

//a class can implement another class and an interface together 
//while doing so we have to extend the classs first and then implement 
//the interface

interface DemoP1 {
	int NUM = 7;
}

abstract class DemoP2 {
	abstract void show();
}

//order of inheriting is aphabetical
//first extends keyword and then implements

public class ExtendsImplementsDemo extends DemoP2 implements DemoP1 {

	void show() {
		System.out.println("value from an interface: "+NUM);
	}
	
	public static void main(String[] args) {
		ExtendsImplementsDemo demo=new ExtendsImplementsDemo();
		demo.show();

	}

}
