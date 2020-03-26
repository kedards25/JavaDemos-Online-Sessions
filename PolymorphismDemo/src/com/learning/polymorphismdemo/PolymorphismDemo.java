package com.learning.polymorphismdemo;

public class PolymorphismDemo {

	void showVal(int... nums) {
		for (int n : nums) {
			System.out.print(n+"\t");
		}
	}

	public static void main(String[] args) {

		PolymorphismDemo demo = new PolymorphismDemo();
	
		
		demo.showVal(4,5,6);
		System.out.println();
		demo.showVal(4,5,6,8,7,5);
		System.out.println();
		demo.showVal(4,5,6,7);
		System.out.println();
		demo.showVal(4,5,6,2,32,4,5,5,456,7,5);
		System.out.println();
		demo.showVal(4,5,6,2,32,4,5,5,456,7,5,7,5,7,6,4);

	}

}
