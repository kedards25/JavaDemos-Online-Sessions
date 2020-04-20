package com.learning.localisingdate;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocalisingDate {

	public static void main(String[] args) {
		Locale russianLocale=new Locale("de","DE");
		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.LONG,russianLocale);
		String formattedDate=dateFormat.format(new Date());
		System.out.println("Date in current locale: "+new Date()+" "
				+ "and same date in german format:"+formattedDate);

	}

}
