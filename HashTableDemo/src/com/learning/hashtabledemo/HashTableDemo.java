package com.learning.hashtabledemo;

import java.util.*;


public class HashTableDemo {

	public static void main(String[] args) {

		//HashTable is synchronized and does not accept null values
		Map<String,String> studentsMap=new Hashtable<String, String>();
		
//		studentsMap.put(key, value);
		studentsMap.put("S001", "Avdhoot");
		studentsMap.put("S004", "Shubham");
		studentsMap.put("S003", "Talha" );
		studentsMap.put("S002", "Maitrii");
		studentsMap.put("S005", "Ekta");
		
		Set<String> idSet=studentsMap.keySet();
//		System.out.println(idSet);
		
//		Iterator iterator=idSet.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//			
//		}
		
		for (String num : idSet) {
			System.out.println("student id: "+num+" name: "+studentsMap.get(num));
			
		}
	}

}
