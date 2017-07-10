package com.beeva.jpa.demo.daoImple;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beeva.jpa.demo.dao.UserDAO;
import com.beeva.jpa.demo.model.User;

@Repository
public class UserDAOImpl extends UserDAO {
	@PersistenceContext
	EntityManager entityManager;
	

	@Transactional
	public User saveUser(User user) {
		entityManager.persist(user);
		return user;
		
	}

	public User getUser(int Id) {
		return entityManager.find(User.class, Id);
	}

}
