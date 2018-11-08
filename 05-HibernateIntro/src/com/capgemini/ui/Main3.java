package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.bussiness.Employee;

public class Main3 {

	public static void main(String[] args) {
		// merge()-update
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
	     EntityManager em= emf.createEntityManager();
		Employee e=null;
		e=em.find(Employee.class,2);
		e.setBasicSalary(333333);
		em.getTransaction().begin();
		em.merge(e);//for updates
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
