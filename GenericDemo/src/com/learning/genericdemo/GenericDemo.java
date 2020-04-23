package com.learning.genericdemo;

//To declare given class as generic class 
//we have to pass generic type as diamond operator
public class GenericDemo<T> {

	//same generic type is prefixed with variable
	T num;
	
	void show(T val)
	{
		num=val;
		System.out.println(num);
	}
	public static void main(String[] args) {
		
		System.out.println("Variable as int type");
		//num is treated as int num
		GenericDemo<Integer> intObj=new GenericDemo();
		intObj.show(25);
		
		System.out.println("Variable as double type");
		//num is treated as double num
		GenericDemo<Double> doubleObj=new GenericDemo();
		doubleObj.show(25.52);
		
		System.out.println("Variable as character type");
		//num is treated as char num
		GenericDemo<Character> charObj=new GenericDemo();
		charObj.show('k');
	}

}
