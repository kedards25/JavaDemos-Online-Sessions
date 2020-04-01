package com.learning.finallydemo;

public class FinallyDemo {

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
			System.out.println("\nError occurred in code "+ex);
		}
		catch(Exception ex)
		{
			System.out.println("\nError occurred in code "+ex);
		}
		//this part will be executed when error occurs
		//and even when the code executes smoothly
		finally
		{
			try
			{
				//code to close the resource or connection
			}
			catch(Exception e)
			{
				//to handle the error while closing the resource
			}
			System.out.println("\nEnd of the program");
		}
	}

}
