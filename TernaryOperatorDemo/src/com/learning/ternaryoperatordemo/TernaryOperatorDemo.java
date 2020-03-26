package com.learning.ternaryoperatordemo;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		int val;
		System.out.println("Enter any number");
		Scanner scanner=new Scanner(System.in);
		val=scanner.nextInt();
		System.out.println(val%2==0?"Even":"Odd");

	}

}
