package com.jpa_Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("preethi");
		EntityManager entity=factory.createEntityManager();
		
		//entity object has persist(insert), merge(update), find(fetch), remove(delete)
		
		entity.getTransaction().begin();
		
		//insert
		Employee emp =new Employee(101,"preethi",20000,"chennai");
		//Employee em1=new Employee(102,"ramya",30000,"kochi");
		entity.persist(emp);
		//entity.persist(em1);
		
		//fetch
		//Employee emp=entity.find(Employee.class,101);
		//System.out.println(emp);
		
		//update
//		emp.setEmp_add("hyderabad");
//		emp.setEmp_name("raasi");
//		emp.setEmp_sal(700000);
//		
		//entity.merge(emp);
		
		//remove
		//entity.remove(emp);
		
		
		entity.getTransaction().commit();
		
		}
}
