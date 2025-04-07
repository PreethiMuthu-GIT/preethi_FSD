package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@SpringBootTest
class SpringBootJpaJunit1ApplicationTests {

	@Autowired
	EmployeeService service;
	
	
//	  @Test 
//	  public void testAddEmployee() { 
//		  Employee emp=new Employee(101,"preethi",1000,"chennai");
//		  Employee emp1=new Employee(102,"ramya",2000,"kochi");
//		  Employee emp2=new Employee(103,"rassi",3000,"hyderabad");
//		  service.addEmployee(emp);
//		  service.addEmployee(emp1);
//		  service.addEmployee(emp2);
//	      assertEquals(emp1.getEmpname(), "ramya");
//	      }
	 

	
//	  @Test
//	  public void testUpdateEmployee(){ 
//		  Employee emp=new Employee(102,"ramya",10000,"kerala"); 
//		  service.updateEmployee(emp);
//	      assertEquals(emp.getEmpname(), "ramya");
//	  }
	 
//	 @Test
//	 public void testGetEmployee() {
//		 Employee emp2=new Employee(103,"rassi",3000,"hyderabad");
//		 service.getEmployee(103);
//		 assertEquals(emp2.getEmpname(), "rassi");
//	 }
	
	
//	  @Test public void testDeleteEmployee() { 
//		  service.deleteEmployee(101);
//	  }
	 
	@Test
	public void testGetAllEmployees() {
		List<Employee> li=service.getAllEmployees();
		if(li!=null) {
			assert(true);
		}
		else {
			assert(false);
		}
		
	}
	

}
