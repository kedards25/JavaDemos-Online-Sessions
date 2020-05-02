package com.learning.threadsleepdemo;

public class ThreadSleepDemo extends Thread {

	public void run() {
		
		System.out.println("Child execution started..");
		for (int i = 0; i < 10; i++) {
			
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("child sleep interrupted "+e);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Main started..");
		
		System.out.println("Object created and assigned to thread");
		ThreadSleepDemo sleepDemo=new ThreadSleepDemo();
		Thread thread=new Thread(sleepDemo);
		
		System.out.println("Main invoking child function..");
		thread.start();
		
		System.out.println("Main going to sleep..");
		//sleep time is provided in mili seconds
		//in order avoid sleepInterruption,we shall put our code in try catch block
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main sleep interrupted "+e);
		}
		//thread.interrupt();
		thread.stop();
		System.out.println("Main finished..");

	}

}
