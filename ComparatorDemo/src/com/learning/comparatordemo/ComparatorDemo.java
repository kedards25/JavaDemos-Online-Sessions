package com.learning.comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

class HDTV
{
	private int size;
	private String brand;
	
	public HDTV(int size, String brand) {
		super();
		this.size = size;
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public String toString() {
		return "HDTV [size=" + size + ", brand=" + brand + "]";
	}

	
	
}

class sizeComparator  implements Comparator<HDTV>
{
	@Override
	public int compare(HDTV firstObj, HDTV secondObj) {
		
		//each object will be compared with rest objects one by one
		if(firstObj.getSize()>secondObj.getSize())
			return 1;
		else
			if(firstObj.getSize()<secondObj.getSize())
				return -1;
			else
				return 0;
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		HDTV tv1=new HDTV(32, "Panasonic");
		HDTV tv2=new HDTV(24, "LG");
		HDTV tv3=new HDTV(43, "Samsung");
		HDTV tv4=new HDTV(55, "SONY");
		
		ArrayList<HDTV> tvList=new ArrayList();
		tvList.add(tv1);
		tvList.add(tv2);
		tvList.add(tv3);
		tvList.add(tv4);
		
		Collections.sort(tvList,new sizeComparator());	
		
//		ListIterator tvIterator=tvList.listIterator();
//		while(tvIterator.hasNext())
//		{
//			System.out.println(tvIterator.next());
//		}
//		
		System.out.println("Brands according to their increasing size");
		for(HDTV tv:tvList)
		{
			System.out.println(tv.getBrand());
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "ComparatorDemo []";
	}

}
