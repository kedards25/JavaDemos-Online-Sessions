package com.learning.springhibernateconfig.dao;

import java.util.List;

import com.learning.springhibernateconfig.models.UserData;

public interface IDAO {

	public List<UserData> getUsers();
	
	public int addUser(UserData data);
	
	
}
