package com.learning.patternmatcherdemo;

import java.util.regex.*;

public class PatternMatcherDemo {

	public static void main(String[] args) {
		
		
		Pattern pattern=Pattern.compile("smart");
		Matcher m=pattern.matcher("Avdhoot is a smart boy");
		//Matcher m=pattern.matcher("Avdhoot");
		
		//Pattern should be found in the statement given in matcher
		if (m.find()) {
			System.out.println("Avdhoot found as smart boy");
		}
		else
		{
			System.out.println("Avdhoot anyways is not a smart boy");
		}
		
		//Pattern should match exactly in the statement given in matcher
//		if (m.matches()) {
//			System.out.println("Avdhoot found as smart boy");
//		}
//		else
//		{
//			System.out.println("Avdhoot anyways is not a smart boy");
//		}
	}

}
