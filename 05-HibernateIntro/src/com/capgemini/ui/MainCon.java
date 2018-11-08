package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.bussiness.Contact;

public class MainCon {
	public static void main(String[] args) {
		Contact contact1= new Contact(101,"santhu","786986");
		Contact contact2= new Contact(102,"puja","876789");
		Contact contact3= new Contact(103,"bagi","875856");
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em= emf.createEntityManager();
		em.getTransaction().begin();
		/*em.persist(contact1);
		em.persist(contact2);
		em.persist(contact3);*/
		
		contact3.setPhoneNumber("94234124312");//only object will change not in db
		em.merge(contact3);//now changes merged
		em.close();
		emf.close();
		Contact contact4=null;
		emf=Persistence.createEntityManagerFactory("JPA-PU");
		em=emf.createEntityManager();
		em.getTransaction().begin();
		contact4=em.find(Contact.class, 103);//attached
		contact4.setPhoneNumber("34124312");
		em.merge(contact4);
		System.out.println(contact3.equals(contact4));
		em.getTransaction().commit();
		
		
		
		
		
	}

}
