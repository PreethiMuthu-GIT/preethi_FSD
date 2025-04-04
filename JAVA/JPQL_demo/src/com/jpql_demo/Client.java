package com.jpql_demo;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("preethi");
		EntityManager entity=factory.createEntityManager();
		
		entity.getTransaction().begin();
		
		Employee emp1=new Employee(1,"preethi",100,"delhi");
		Employee emp2=new Employee(2,"manasa",200,"kolkata");
		Employee emp3=new Employee(3,"bhanu",300,"bnglre");
		Employee emp4=new Employee(4,"srivani",400,"goa");
		
		//insert
		entity.persist(emp1);
		entity.persist(emp2);
		entity.persist(emp3);
		entity.persist(emp4);
		
	//fetching data from database
		Query q=entity.createQuery("select e from Employee e");
		List<Employee> li=q.getResultList();
		
		for(Employee e:li) {
			System.out.println("Employee id: "+e.getE_id());
			System.out.println("Employee name:"+e.getE_name());
			System.out.println("Employee salary:"+e.getE_salary());
			System.out.println("Employee Address:"+e.getE_add());
		}
		
	//converting all the employeenmaes to uppercase
		Query q1=entity.createQuery("select UPPER(e.e_name) from Employee e");
		List<String> li1=q1.getResultList();
		
		for(String name:li1) {
			System.out.println(name);
		}
		
	//select maximum salary in the employees
		Query q2=entity.createQuery("select Max(e.e_sal) from Employee e");
		int maxValue=(int)q2.getSingleResult();
		System.out.println("maximum salary is:"+maxValue);
		
	//select salaries in between range
		Query q3=entity.createQuery("select e from Employee e where e.e_sal between 1000 and 4000");
		List<Employee> sal=q3.getResultList();
		
		for(Employee ee:sal) {
			System.out.println("Employee id:"+ee.getE_id());
			System.out.println("Employee salary:"+ee.getE_salary());
		}
		
	//updating salaries which are having more than 2000
		Query q4=entity.createQuery("update Employee set e_sal=e_sal+5000 where empsal>2000");
		int updated=q4.executeUpdate();
		System.out.println("updated:"+updated);
		
	//delete salary less than 7000
		Query q5=entity.createQuery("delete From Employee where empsal>7000");
		int dlted=q5.executeUpdate();
		System.out.println("deleted :"+dlted);
		
		entity.getTransaction().commit();
		
		
		}
}
