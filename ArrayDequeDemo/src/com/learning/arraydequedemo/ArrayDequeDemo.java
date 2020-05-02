package com.learning.arraydequedemo;

import java.util.*;

public class ArrayDequeDemo {
	
	
	public static void main(String[] args) {
		Deque<Double> deqObj=new ArrayDeque();
		deqObj.add(new Double(4.5));
		deqObj.add(new Double(5.7));
		deqObj.add(new Double(8.4));
		deqObj.add(new Double(3.2));
		
		System.out.println("size: "+deqObj.size());
		
		
		System.out.println(deqObj);
		deqObj.addFirst(new Double(1.5));
		deqObj.addLast(new Double(3.5));
		
		System.out.println(deqObj);
		System.out.println("size: "+deqObj.size());
		
		deqObj.removeFirst();
		System.out.println("after removing first element:");
		System.out.println(deqObj);
		System.out.println("size: "+deqObj.size());
		
		deqObj.removeLast();
		System.out.println("after removing Last element:");
		System.out.println(deqObj);
		System.out.println("size: "+deqObj.size());
		
	}
}
