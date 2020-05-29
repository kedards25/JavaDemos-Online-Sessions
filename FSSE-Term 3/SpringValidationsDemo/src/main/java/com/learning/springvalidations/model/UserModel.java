package com.learning.springvalidations.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;


@Component
public class UserModel {

	@Size(min=1,message = "cannot be left blank")
	public String userName;
	
	@NotNull
	@NotBlank
	@NotEmpty(message = "error")
	public String userPass;
	
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserModel(String userName, String userPass) {
		super();
		this.userName = userName;
		this.userPass = userPass;
	}
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}
	
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}


	@Override
	public String toString() {
		return "UserModel [userName=" + userName + ", userPass=" + userPass + "]";
	}
	
	
	
	
}
