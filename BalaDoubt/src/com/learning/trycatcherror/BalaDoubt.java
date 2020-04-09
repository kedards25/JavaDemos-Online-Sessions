package com.learning.trycatcherror;

import java.util.HashMap;

public class BalaDoubt {
	boolean flag=false;
	HashMap hm=new HashMap();
	public HashMap testMethod() {
		
		try {
			if (true) {
				System.out.println("if block");
				hm.put("success", true);
				return hm;
				
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			boolean val= (boolean) hm.get("success");
			if (val) {
				System.out.println(val);
				return hm;
			}
			else
			{
			System.out.println("finally block");
			hm.put("success", flag);
			}
		}
		return hm;
	}
	
	public static void main(String[] args) {
		
		BalaDoubt doubt=new BalaDoubt();
		System.out.println(doubt.testMethod());
				
	}

}

	