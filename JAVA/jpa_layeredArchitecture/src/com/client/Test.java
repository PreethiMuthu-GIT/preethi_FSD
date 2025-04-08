package com.client;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		EmployeeService service= new EmployeeServiceImpl();
		
		Employee emp= new Employee(1, "preethi", 10000, "hyd");
		
		service.addEmployee(emp);
		
//		Employee empi=service.findEmployeeById(234);
//		System.out.println(empi);
//		
//		
//		empi.setEmpname("preethi");
//		empi.setEmpsal(6000);
//		empi.setEmpadd("kochi");
		
		//service.updateEmploye(empi);
		
		//service.deleteEmployee(empi);
	}
}
