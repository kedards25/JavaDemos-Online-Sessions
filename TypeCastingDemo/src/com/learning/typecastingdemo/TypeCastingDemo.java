package com.learning.typecastingdemo;

//Type casting refers to conversion of one
//data type to another
public class TypeCastingDemo {

	public static void main(String[] args) {
		int a = 5;
		double b = 5.7;
		b=a;//implicit type casting
		a = (int)b;//explicit type casting
		System.out.println(b);
	}
}
