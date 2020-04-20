package com.learning.emailvalidationdemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String email;
		System.out.println("Enter email ID");
		email=scanner.next();
		Pattern pattern=Pattern.compile("@");
		Matcher match=pattern.matcher(email);
		if (match.find()) {
			System.out.println("Welcome "+email);
		}
		else
		{
			System.out.println("Enter valid email id");
		}

	}

}
