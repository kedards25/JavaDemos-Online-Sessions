package com.learning.threadexecutiondemo;

public class ThreadExecutionDemo implements Runnable{

	void disp()
	{
		System.out.println("from disp");
	}
	public void run()
	{
		System.out.println("From Show");
		disp();
	}
	
	public static void main(String[] args) {
		
		//in threading,current process finishes its own operation first and
		//then executes other function
		System.out.println("Main execution started");
		
		System.out.println("Main creating object..");
		ThreadExecutionDemo demo=new ThreadExecutionDemo();
		Thread thread=new Thread(demo);
		
		System.out.println("Main invoking function");
		thread.start();
		
		System.out.println("Main execution finished..");
		

	}

}
