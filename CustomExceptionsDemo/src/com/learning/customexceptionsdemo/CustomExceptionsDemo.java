package com.learning.customexceptionsdemo;

import java.util.Scanner;

class GreaterNumberException extends Exception {

	public GreaterNumberException(String msg) {
		// The received msg parameter is passed to parent class's
		// parameterised constructor
		super(msg);
		System.out.println("Constr: "+msg);
	}
}

class DivideByZeroException extends Exception {
	
	public DivideByZeroException(String value) {
		super(value);
	}
}

public class CustomExceptionsDemo {
	int a, b;
	double c;
	Scanner scanner = new Scanner(System.in);

	void acceptData() {
		System.out.println("Enter two numbers");
		a = scanner.nextInt();
		b = scanner.nextInt();
	}

	void performOperation() {
		try {
			if (b > a) {
				throw new GreaterNumberException("Second no cannot greater than first ");
			} else {
				c = a - b;
				System.out.println(c);
			}
		} catch (GreaterNumberException e) {
			// GreaterNumberException e=new GreaterNumberException("Second no cannot greater
			// than first ");
			System.out.println(e.getMessage());
		}

	}
	
	void divideNums()
	{
		try {
			if (b ==0) {
				throw new DivideByZeroException("Second no cannot be zero ");
			} else {
				c = a / b;
				System.out.println(c);
			}
		} 
		catch(DivideByZeroException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

	public static void main(String[] args) {
		CustomExceptionsDemo demo = new CustomExceptionsDemo();
		demo.acceptData();
		demo.performOperation();
		//demo.divideNums();

	}

}
