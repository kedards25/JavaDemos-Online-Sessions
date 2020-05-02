package com.learning.hashmapdemo;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,String> studentsMap=new HashMap();
		
//		studentsMap.put(key, value);
		studentsMap.put("S001", "Avdhoot");
		studentsMap.put("S002", "Shubham");
		studentsMap.put("S003", "Talha");
		studentsMap.put("S004", "Maitrii");
		studentsMap.put("S005", "Ekta");
		
		Set<String> idSet=studentsMap.keySet();
		System.out.println(idSet);
		
//		Iterator iterator=keySet.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//			
//		}
		
		for (String num : idSet) {
			System.out.println("student id: "+num+" name: "+studentsMap.get(num));
			
		}
		

	}

}
