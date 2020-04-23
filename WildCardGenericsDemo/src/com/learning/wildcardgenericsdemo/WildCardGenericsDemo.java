package com.learning.wildcardgenericsdemo;

public class WildCardGenericsDemo<T> {

	public T val;
	
	
	public T getVal() {
		return val;
	}


	public void setVal(T val) {
		this.val = val;
	}

	public boolean compare(WildCardGenericsDemo<? extends Number> w)
	{
		//obj1.val==obj2.val
		if(val==w.val) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		WildCardGenericsDemo<Integer> obj1=new WildCardGenericsDemo<Integer>();
		obj1.setVal(10);
		
		WildCardGenericsDemo<Integer> obj2=new WildCardGenericsDemo<Integer>();
		obj2.setVal(15);
		
		System.out.println(obj1.compare(obj2));
		
		
	}

}
