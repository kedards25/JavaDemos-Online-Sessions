package com.learning.abstractiondemo;

//Abstract classes are those classes 
//which contain methods with or without body
//these classes are considered to be incomplete classes
//hence object of abstract class cannot be created
//in order to complete abstract class, methods need to be overridden in child class
abstract class Abstractclass {
	abstract void show();

	abstract void showMsg();

	void disp() {
		System.out.println("Hello from abstract class");
	}

}

//if any class is extending an abstract class,then it should override all the abstract methods
//from parent class or else the class also has to be declared as abstract

abstract class DemoP extends Abstractclass {
	void showMsg() {
		System.out.println("Hello from showMsg in DemoP");
	}
}

class DemoC extends Abstractclass{

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("Test");
	}

	@Override
	void showMsg() {
		// TODO Auto-generated method stub
		System.out.println("Sample");
	}
}

public class AbstractionDemo extends DemoP {

	void show() {
		System.out.println("Overridden method from child class");
	}

	public static void main(String[] args) {
		Abstractclass abstractionDemo = new AbstractionDemo();
		abstractionDemo.disp();
		abstractionDemo.show();
		abstractionDemo.showMsg();
		
		System.out.println();
		
		Abstractclass abstractclass=new DemoC();
		abstractclass.disp();
		abstractclass.show();
		abstractclass.showMsg();

	}

}
