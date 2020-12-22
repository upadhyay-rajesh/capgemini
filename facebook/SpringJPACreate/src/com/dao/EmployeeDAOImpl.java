package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.orm.jpa.JpaTemplate;

import com.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	private EntityManagerFactory entityManagerFactory;

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory= entityManagerFactory;
	}

	public boolean createEmployee(Employee emp) {
		EntityManager em=entityManagerFactory.createEntityManager();
		//JpaTemplate jt=new JpaTemplate(entityManagerFactory);
		boolean status=false;
		EntityTransaction  tx=null;
		try {
		//	tx=em.getTransaction();
			//tx.begin();
			//em.persist(emp);
			em.persist(emp);
			//tx.commit();
			status=true;
		}catch(Exception e) {

		}finally {
			//em.close();
		}
		return status;
	}




}
