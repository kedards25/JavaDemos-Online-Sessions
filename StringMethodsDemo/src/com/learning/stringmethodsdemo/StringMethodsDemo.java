package com.learning.stringmethodsdemo;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String val="Sankalp ";
//		String val4="Angchekar";
//		System.out.println(val.length());
//		System.out.println(val.charAt(2));
		char []val2=new char[3];
//		//it includes starting index but not the ending index
		val.getChars(3,6, val2, 0);
		System.out.println(val2);
//		String val3="SankalpAngchekar";
//		System.out.println(val3.compareTo(val));
//		System.out.println(val.startsWith("S"));
//		System.out.println(val.endsWith("p"));
//		System.out.println(val.indexOf('k'));
//		System.out.println(val.lastIndexOf('k'));
//		System.out.println(val.substring(7));
//		System.out.println(val.concat(val4));
//		String val5="lock";
//		System.out.println(val5.replace('c', 'o'));
		int num=7;
		//in order to convert primitive value as string
		//toString method cannot be used
		//instead we have to use String.valueOf
//		String numString=String.valueOf(num);
//		System.out.println("value is: "+num);
		
		
	}
}
