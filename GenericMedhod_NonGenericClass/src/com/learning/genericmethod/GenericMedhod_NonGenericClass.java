package com.learning.genericmethod;

public class GenericMedhod_NonGenericClass {

	public <D> D showVal(D num)
	{
		return num;
	}
	
	public static void main(String[] args) {
		
		//Class being non-generic
		//need not to declare generic type along with the object
		GenericMedhod_NonGenericClass intObj=new GenericMedhod_NonGenericClass();
		System.out.println(intObj.showVal(25));
			
		GenericMedhod_NonGenericClass doubleObj=new GenericMedhod_NonGenericClass();
		System.out.println(doubleObj.showVal(25.52));
	}

}
