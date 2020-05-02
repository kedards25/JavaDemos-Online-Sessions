package com.learning.services;

import java.sql.*;
import java.util.*;

import org.springframework.stereotype.Component;

import com.learning.models.UserModel;

@Component
public class UserDAO_Impl implements IUserDao {

	Connection connection;
	String user="sa";
	String password="";
	String url="jdbc:h2:tcp://localhost/~/test";
	Statement statement;
	UserModel model;
	List<UserModel> userList=null;
	
	private boolean getConn()
	{
		try {
			Class.forName("org.h2.Driver");
			connection=DriverManager.getConnection(url, user, password);
			if (connection!=null) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			System.out.println("getConn:ClassNotFoundException "+e);
		} catch (SQLException e) {
			System.out.println("getConn:SQLException "+e);

		}
		return false;
	}
	
	public List<UserModel> getDetails() {
		if (getConn()) {
			userList=new ArrayList();
			String q="select * from usermodel";
			try {
				statement=connection.createStatement();
				ResultSet resultSet=statement.executeQuery(q);
				while(resultSet.next())
				{
					model=new UserModel();
					model.setUserName(resultSet.getString("name"));
					model.setUserPwd(resultSet.getString("pwd"));
					userList.add(model);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("getDetails:SQLException "+e);
			}
			
		}
		return userList;
	}

}
