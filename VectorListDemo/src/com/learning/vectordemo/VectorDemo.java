package com.learning.vectordemo;

import java.util.*;


public class VectorDemo {

	public static void main(String[] args) {
List<Integer> numList=new Vector();
		
		//values of int object does not decide the sequence
		Integer int1=new Integer(101);
		Integer int2=new Integer(104);
		Integer int3=new Integer(105);
		Integer int4=new Integer(105);
		Integer int5=new Integer(103);
		
		numList.add(int1);
		numList.add(int2);
		numList.add(int3);
		numList.add(int4);
		numList.add(int5);
		
		ListIterator iterator=numList.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
