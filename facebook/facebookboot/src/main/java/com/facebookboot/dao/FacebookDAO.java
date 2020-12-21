package com.facebookboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.facebookboot.entity.FacebookUser;

@Repository
public class FacebookDAO implements FacebookDAOInterface{
	@Autowired
	private EntityManager em;
	
	@Transactional	
	public int createProfileDAO(FacebookUser fu) {
		int i=0;
			em.persist(fu);
		i=1;
		return i;
	}
}
