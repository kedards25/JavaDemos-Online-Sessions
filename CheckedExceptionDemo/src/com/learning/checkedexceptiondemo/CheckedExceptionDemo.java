package com.learning.checkedexceptiondemo;

import java.util.Scanner;

public class CheckedExceptionDemo {

	int a,b,c;
	Scanner scanner=new Scanner(System.in);
	void acceptData() {
		System.out.println("Enter two numbers");
		a=scanner.nextInt();
		b=scanner.nextInt();
	}
	
	void performOperation()
	{
		try {
			if (b>a) {
				throw new ArithmeticException();
			}
			else
			{
				c=a-b;
				System.out.println(c);
			}
		} catch (Exception e) {
			System.out.println("Second no cannot greater than first "+e);
		}
	}
	public static void main(String[] args) {
		CheckedExceptionDemo demo=new CheckedExceptionDemo();
		demo.acceptData();
		demo.performOperation();
	}

}
