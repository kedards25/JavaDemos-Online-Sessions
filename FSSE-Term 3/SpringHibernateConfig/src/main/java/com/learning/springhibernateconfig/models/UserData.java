package com.learning.springhibernateconfig.models;


public class UserData {

	private int userId;
	private String name;
	private String addr;
	private String pass;
	
	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserData(int userId, String name, String addr, String pass) {
		super();
		this.userId = userId;
		this.name = name;
		this.addr = addr;
		this.pass = pass;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "UserModel [userId=" + userId + ", name=" + name + ", addr=" + addr + ", pass=" + pass + "]";
	}
	
	
	
}
