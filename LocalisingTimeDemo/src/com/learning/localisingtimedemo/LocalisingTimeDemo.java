package com.learning.localisingtimedemo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocalisingTimeDemo {

	public static void main(String[] args) {
		Locale russianLocale=new Locale("de","DE");
		DateFormat dateFormat=DateFormat.getTimeInstance(DateFormat.LONG,russianLocale);
		String formattedDate=dateFormat.format(new Date());
		System.out.println("Date in current locale: "+new Date()+" "
				+ "and same date in german format:"+formattedDate);
	}
}
