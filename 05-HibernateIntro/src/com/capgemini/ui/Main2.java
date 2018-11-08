package com.capgemini.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.bussiness.Employee;

public class Main2 {

	public static void main(String[] args) {
		//displaying all objects by using "createQuery()" and "getResultList" methods
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
	     EntityManager em= emf.createEntityManager();
	     String myQuery="from Employee";//java className(Employee)--jpql(java persistence query language)
	     Query query=em.createQuery(myQuery);
	     
	     List<Employee> empList=null;
	     empList=query.getResultList();
	     System.out.println(empList);
	     em.close();
	     emf.close();
		
	}
}
