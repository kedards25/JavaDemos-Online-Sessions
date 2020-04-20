package com.learning.mvc_gui.controller;

import com.learning.mvc_gui.models.UserModel;
import com.learning.mvc_gui.views.FailureGUI;
import com.learning.mvc_gui.views.SuccessGUI;

public class UserController {

	//do not create or initialize the model object
	//as it is received as parameter from inputLayout
	//it is already initialized there
	public boolean verifyUser(UserModel model)
	{
		String receivedName=model.getUserName();
		String receivedPass=model.getUserPwd();
		if (receivedName.equals("Kedar") && receivedPass.equals("123")) {
			return true;
		}
		return false;
	}
	
}
