package com.learning.thread_demo;

public class ThreadDemo extends Thread{

	public void run()
	{
		System.out.println("Method invoked using thread class");
	}
	
	public static void main(String[] args) {
		ThreadDemo demo=new ThreadDemo();
		demo.start();

	}

}
