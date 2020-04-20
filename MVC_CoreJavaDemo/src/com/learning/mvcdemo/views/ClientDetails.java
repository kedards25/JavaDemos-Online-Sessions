package com.learning.mvcdemo.views;

import com.learning.mvcdemo.models.UserModel;

public class ClientDetails {
	
	public void showDetails(UserModel user) {
		int modelId=user.getUserId();
		String modelName=user.getUserName();
		String modelEmail=user.getUserEmail();
		
		System.out.println("***************User Details***************");
		System.out.println("Id: "+modelId);
		System.out.println("Name: "+modelName);
		System.out.println("Email ID: "+modelEmail);
	}
}
