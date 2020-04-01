package com.learning.throwsdemo;

public class ThrowsDemo {

	int []arr={3,2,5,3,8};
	
	void showArr() throws Exception
	{
		for (int i = 0; i < 7; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		ThrowsDemo throwsDemo=new ThrowsDemo();
		try
		{
			//try to invoke the method
			//if an exception is thrown then
			//it should be handled by catch block in main
		throwsDemo.showArr();
		}
		catch(Exception ex)
		{
			System.out.println("Error occurred "+ex);
		}
	}

}
