package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.bussiness.Employee;

public class Main1 {

	public static void main(String[] args) {
//For displaying one object using "find()" method. only find() no persist() coz only reading no changes made so no need of transactions
     EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
     EntityManager em= emf.createEntityManager();
     Employee e=null;
     e=em.find(Employee.class, 1);//class name, primary key
     System.out.println(e);
     em.close();
     emf.close();
     
     
     
	}

}
