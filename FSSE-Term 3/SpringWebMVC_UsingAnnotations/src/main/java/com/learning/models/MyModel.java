package com.learning.models;

import org.springframework.stereotype.Component;

@Component
public class MyModel {

	private String userName;
	private String userEmail;
	
	public MyModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyModel(String userName, String userEmail) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "MyModel [userName=" + userName + ", userEmail=" + userEmail + "]";
	}
	
	
	
}
