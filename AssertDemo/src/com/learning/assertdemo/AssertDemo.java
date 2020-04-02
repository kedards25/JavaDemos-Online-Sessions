package com.learning.assertdemo;

import java.util.Scanner;

public class AssertDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int age;
		System.out.println("Enter your age");
		age=scanner.nextInt();
		
		assert(age>20)&&(age<60);
		System.out.println("You can apply for the job");

	}

}
