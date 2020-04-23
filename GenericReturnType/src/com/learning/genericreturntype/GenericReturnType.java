package com.learning.genericreturntype;


public class GenericReturnType<T> {

	T num;
	
	public T dispVal(T val)
	{
		num=val;
		return num;
	}
	public static void main(String[] args) {
		GenericReturnType<Integer> intObj=new GenericReturnType();
		System.out.println(intObj.dispVal(25));
		
		GenericReturnType<Double> doubleObj=new GenericReturnType();
		System.out.println(doubleObj.dispVal(25.25));
	}
}
