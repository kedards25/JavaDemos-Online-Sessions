package com.learning.treemapdemp;

import java.util.*;


public class TreeMapDemo {

	public static void main(String[] args) {
		//the only diff between HashMap and TreeMap is
		//TreeMap is sorted whereas hashmap is not
		Map<String,String> studentsMap=new TreeMap();
		
//		studentsMap.put(key, value);
		studentsMap.put("S001", "Avdhoot");
		studentsMap.put("S004", "Shubham");
		studentsMap.put("S003", null );
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
