package com.learning.arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		Integer int1=new Integer(101);
		Integer int2=new Integer(102);
		Integer int3=new Integer(102);
		Integer int4=new Integer(104);
		Integer int5=new Integer(105);
		
		
		//creation of ArrayList object named as intList
		//which is of generic type Integer
		//Object being created of List interface
		//hides implementation of ArrayList
		List<Integer> intList=new ArrayList();
		//As we are working on Array,we have to deal with index
		//and not the values 
		intList.add(int1);
		intList.add(int2);
		intList.add(int3);
		intList.add(int4);
		intList.add(int5);

		//It is advised to use forEach loop as the size of collection 
		//is unknown
		for(Integer i:intList)
		{
			System.out.println(i);
		}
	}

}
