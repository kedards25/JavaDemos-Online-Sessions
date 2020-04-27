package com.learning.listpropertiesdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListPropertiesDemo {

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
		intList.add(int1);
		intList.add(int2);
		intList.add(int3);
		intList.add(int4);
		intList.add(int5);
		
		//System.out.println(intList.size());
		//System.out.println(intList.add(new Integer(107)));
//		intList.add(3,107);
		//System.out.println(intList.get(2));
		//System.out.println(intList.remove(2));
		//first matching object will be removed from list
		//System.out.println(intList.remove(new Integer(102)));
		
		ListIterator<Integer> intIterator=intList.listIterator();
		
		//checking if list has next value
		while(intIterator.hasNext())
		{
			//till iterator gets next value
			//keep displaying the value
			System.out.println(intIterator.next());
		}
		

	}

}
