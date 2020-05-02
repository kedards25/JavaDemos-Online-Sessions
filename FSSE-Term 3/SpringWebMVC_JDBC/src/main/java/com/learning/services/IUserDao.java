package com.learning.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.learning.models.UserModel;

@Component
public interface IUserDao {

	public List<UserModel> getDetails();
}
