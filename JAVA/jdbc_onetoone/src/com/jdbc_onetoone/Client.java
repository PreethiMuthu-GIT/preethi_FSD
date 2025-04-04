package com.jdbc_onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("muthu");
		EntityManager entity=factory.createEntityManager();
		
		entity.getTransaction().begin();
		
		Address add=new Address();
		add.setColony("lalapet");
		add.setPincode(500017);
		add.setState("Telangana");
		
		Employee emp=new Employee();
		emp.setEmpname("Preethi");
		emp.setEmpsal(9000);
		emp.setAddress(add);
		
		//entity.persist(emp);
		
		Employee emp1=entity.find(Employee.class,1);
		System.out.println(emp1);
		
		//update
		emp1.setEmpsal(30000);
		emp1.setEmpname("Muthu");
		
		emp1.getAddress().setState("tamilnadu");	
		
		//entity.merge(emp1);
		
		entity.remove(emp1);
		
		entity.getTransaction().commit();
	}
}
