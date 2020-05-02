package com.learning.comparabledemo;

class HDTV implements Comparable<HDTV>
{
	private int size;
	private String brand;
	
	
	//as values are being set with constructor 
	//we are not using setters
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
	public int compareTo(HDTV tv) {
		//'this' refers to first object of HDTV->tv1
		if(this.getSize()>tv.getSize())
			return 1;
		else
			if(this.getSize()<tv.getSize())
				return -1;
			else
				return 0;
	}
}

public class ComparableDemo {

	public static void main(String[] args) {
		HDTV tv1=new HDTV(45, "Samsung");
		HDTV tv2=new HDTV(55,"SONY");
		if(tv1.compareTo(tv2)>0)
		{
			System.out.println(tv1.getBrand()+" is better than "+tv2.getBrand());
		}
		else
		{
			if(tv1.compareTo(tv2)<0)
			{
				System.out.println(tv2.getBrand()+" is better than "+tv1.getBrand());
			}
			else
			{
				System.out.println("Both are equal");
			}
		}
				

	}

}
