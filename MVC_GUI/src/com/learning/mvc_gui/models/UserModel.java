package com.learning.mvc_gui.models;

public class UserModel {

	private String userName;
	private String userPwd;
	
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserModel(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	@Override
	public String toString() {
		return "UserModel [userName=" + userName + ", userPwd=" + userPwd + "]";
	}
	
	
	
}
