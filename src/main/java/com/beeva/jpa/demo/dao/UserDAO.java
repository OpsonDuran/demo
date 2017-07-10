package com.beeva.jpa.demo.dao;

import com.beeva.jpa.demo.model.User;

public abstract class UserDAO {
	public abstract User saveUser(User user);
	public abstract User getUser(int Id);
	

}
