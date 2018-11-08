package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.bussiness.Employee;

public class Main4 {

	public static void main(String[] args) {
		// remove()-delete
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
	     EntityManager em= emf.createEntityManager();
		Employee e=null;
		e=em.find(Employee.class,3);
	
		em.getTransaction().begin();
		em.remove(e);//for removing

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
