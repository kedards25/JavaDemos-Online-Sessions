package com.learning.threadmethodsdemo;

public class IsAliveDemo extends Thread {

	public void show()
	{
		System.out.println("From show");
	}
	
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("\nIs child alive in its function??"+Thread.currentThread().isAlive()+"-"+i);
				System.out.println("From child function");
				Thread.sleep(200);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//System.out.println("Child thread was interrupted by main");
				System.out.println(e);
			}
		}
		System.out.println("\nrun method finished");
		show();
		
	}
	
	public static void main(String[] args) {
		System.out.println("Main starting..");
		System.out.println("Main creating object");
		IsAliveDemo demo=new IsAliveDemo();
		System.out.println("is Main alive??"+Thread.currentThread().isAlive());
		
		//Child Thread Life cycle state:New
		System.out.println("is child thread alive in main??"+demo.isAlive());
		System.out.println("\nMain invoking child");
		//Child Thread Life cycle state:runnable
		demo.start();
		System.out.println("is child thread alive in main after runnable state??"+demo.isAlive());
		//Child thread enters not runnable state as it is in waiting state
		//it is waiting for main to finish its processing
		
		
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("Main sleeping for 1000 ms");
				Thread.sleep(1000);
//				demo.interrupt();
				System.out.println("\nis child thread alive in main immediately after sleep main sleeps??"+demo.isAlive());
//				System.out.println("is child thread interrupted by main??"+demo.isInterrupted());
				System.out.println("is Main alive immediately after sleep??"+Thread.currentThread().isAlive()+"-"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("\nis Main alive after sleep??"+Thread.currentThread().isAlive());
		System.out.println("Main Finished");
		
	}

}
