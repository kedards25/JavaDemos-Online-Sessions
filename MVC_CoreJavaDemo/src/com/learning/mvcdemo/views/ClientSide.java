package com.learning.mvcdemo.views;

import java.util.Scanner;

import com.learning.mvcdemo.controllers.UserController;


public class ClientSide {
	
	private int data1;
	private String data2,data3;
	Scanner sc=new Scanner(System.in);
	UserController controller=new UserController();
	
	public void getData()
	{
		System.out.println("Enter id,name and email");
		data1=sc.nextInt();
		data2=sc.next();
		data3=sc.next();
		controller.setData(data1,data2,data3);
	}
	
	
}
