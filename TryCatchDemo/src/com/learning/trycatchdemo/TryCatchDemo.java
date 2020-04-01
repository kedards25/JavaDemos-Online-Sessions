package com.learning.trycatchdemo;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		int []arr=new int[]{5,6,7,2,4,2,4};
		try {
		for(int i=0;i<8;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		}
		
		catch(ArrayIndexOutOfBoundsException ex)
		{
			//if this catch block fails to handle the exception
			//the exception is passed to next catch block
			System.out.println("\nError occurred in code "+ex);
		}
		//it is adviced to keep base class "Exception" in the very last catch block
		//as its a base class,it can handle all the exceptions which are not specified in 
		//particular catch block
		catch(Exception ex)
		{
			System.out.println("\nError occurred in code "+ex);
		}
		
	}

}
