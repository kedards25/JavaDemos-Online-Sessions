package com.learning.springhibernateconfig.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learning.springhibernateconfig.models.UserData;

public class IDAO_Impl implements IDAO {

	private SessionFactory sessionFactory;
	List<UserData> userList=null;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}	
	
	public IDAO_Impl() {
		Configuration configuration=new Configuration().configure();
	}

	public List<UserData> getUsers() {
		userList=sessionFactory
				.openSession()
				.createQuery("from userData")
				.list();
		
		return userList;
	}

	public int addUser(UserData data) {
		System.out.println(data);
		sessionFactory.openSession().save(data);
		return 0;
	}

}
