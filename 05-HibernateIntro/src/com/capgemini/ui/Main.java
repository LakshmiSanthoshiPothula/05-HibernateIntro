package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.bussiness.Employee;

public class Main {
	public static void main(String[] args) {
		
		/*For storing object in the database by "persist()" and create only
takes persistance unit name in xml file**/		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		Employee employee=new Employee();
		employee.setEmpId(6);
		employee.setEmpName("santhu");
		employee.setEmpGrade('A');
		employee.setBasicSalary(25000);
		employee.setEmpGender('F');
		
		EntityTransaction t=em.getTransaction();
		t.begin();
		em.persist(employee);//completes the operations with one call "like creation"
		t.commit();
		em.close();
		emf.close();
		System.out.println("Object is stored in db");
	}

}
