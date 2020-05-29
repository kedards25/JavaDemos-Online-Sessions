package com.learning.threadingdemo;

public class ThreadingDemo implements Runnable {

	@Override
	public void run()
	{
		System.out.println("Hello Threading");
	}
	public static void main(String[] args) {
		ThreadingDemo demo=new ThreadingDemo();
		Thread th=new Thread(demo);
		th.start();
	}

}
