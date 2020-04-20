package com.learning.mvcdemo.controllers;

import com.learning.mvcdemo.models.UserModel;
import com.learning.mvcdemo.views.ClientDetails;

public class UserController {

	UserModel model;
	
	public void setData(int id,String nm,String email)
	{
		model=new UserModel(id, nm, email);
		passData();
	}
	
	void passData()
	{
		ClientDetails details=new ClientDetails();
		details.showDetails(model);
	}
	
}
